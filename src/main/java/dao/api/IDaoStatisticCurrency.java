package dao.api;

import core.StatisticCurrency;

import java.time.LocalDate;
import java.util.List;

public interface IDaoStatisticCurrency {
    void saveStatisticCurrency(List<StatisticCurrency> statisticCurrencies);
    List<StatisticCurrency> getCurrency(String typeCurrency);
    List<StatisticCurrency> getCurrency(String typeCurrency, LocalDate dateStart, LocalDate dateEnd);

    List<StatisticCurrency> getAVGStatistic(String typeCurrency, int month, int year);

}
