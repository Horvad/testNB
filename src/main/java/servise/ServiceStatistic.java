package servise;

import core.StatisticCurrency;
import dao.api.IDaoStatisticCurrency;
import servise.api.IServiceCurrency;
import servise.api.IServiceSend;
import servise.api.IServiceStatistic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceStatistic implements IServiceStatistic {
    private final IServiceCurrency serviceCurrency;
    private final IServiceSend serviceSend;
    private final IDaoStatisticCurrency daoStatistic;

    public ServiceStatistic(IServiceCurrency serviceCurrency, IServiceSend serviceSend, IDaoStatisticCurrency daoStatisticCurrency) {
        this.serviceCurrency = serviceCurrency;
        this.serviceSend = serviceSend;
        this.daoStatistic = daoStatisticCurrency;
    }

    @Override
    public List<StatisticCurrency> getCurrency(String typeCurrency, LocalDate dateStart, LocalDate dateEnd) {
        List<StatisticCurrency> statistics = daoStatistic.getCurrency(typeCurrency,dateStart,dateEnd);
        if(!statistics.get(0).getDate().equals(dateStart)){
            List<StatisticCurrency> beforeList = serviceSend.sendGetDynamics(typeCurrency,dateStart,statistics.get(0).getDate().minusDays(1));
            daoStatistic.saveStatisticCurrency(beforeList);
            statistics.addAll(beforeList);
        }
        if(!statistics.get(statistics.size()-1).getDate().equals(dateEnd)){
            List<StatisticCurrency> afterList = serviceSend.sendGetDynamics(
                    typeCurrency,statistics.get(statistics.size()-1).getDate().plusDays(1),dateEnd);
            daoStatistic.saveStatisticCurrency(afterList);
            statistics.addAll(afterList);
        }
        return statistics;
    }

    //Вывести все курсы по заданному типу валюты, имеющиеся в базе данных. Пользователь указывает тип валюты. В качестве ответа получает список курсов валют имеющихся в базе данных.
    @Override
    public List<StatisticCurrency> getCurrency(String typeCurrency) {
        return daoStatistic.getCurrency(typeCurrency);
    }

    @Override
    public double getAvgCurrency(String typeCurrency, int monthMM, int yearYYYY) { //дописать проверку на недостающую дату
        List<StatisticCurrency> statisticCurrencies = daoStatistic.getAVGStatistic(typeCurrency,monthMM,yearYYYY);
        double avg = 0;
        for(StatisticCurrency statisticCurrency : statisticCurrencies){
            avg = avg + statisticCurrency.getCur_OfficialRate()/10000;
        }
        avg = avg/statisticCurrencies.size();
        return avg;
    }
}
