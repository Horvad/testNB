package dao.api;

import core.Currency;

import java.util.List;

public interface IDaoCurrency {
    int getID(String typeCurrency);
    void saveCurrency(List<Currency> currencies);
    boolean exist(String typeCurrency);
    List<Currency> getCurrency();
    void remove(int id);
}
