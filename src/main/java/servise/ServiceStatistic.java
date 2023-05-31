package servise;

import core.StatisticCurrency;
import servise.api.IServiceStatistic;

import java.time.LocalDate;
import java.util.List;

public class ServiceStatistic implements IServiceStatistic {
    @Override
    public List<StatisticCurrency> getCurrency(String typeCurrency, LocalDate dateStart, LocalDate dateEnd) {
        return null;
    }

    @Override
    public List<StatisticCurrency> getCurrency(String typeCurrency) {
        return null;
    }

    @Override
    public double getAvgCurrency(String typeCurrency, int monthMM, int yearYYYY) {
        return 0;
    }
}
