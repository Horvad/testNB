package servise.api;

import core.Currency;

import java.util.List;

public interface IServiceCurrency {
    void save(List<Currency> currencies);
    int getId(String typeCurrency);
}
