package servise;

import core.Currency;
import dao.api.IDaoCurrency;
import servise.api.IServiceCurrency;

import java.util.LinkedList;
import java.util.List;

public class ServiceCurrency implements IServiceCurrency {
    private final IDaoCurrency daoCurrency;

    public ServiceCurrency(IDaoCurrency daoCurrency) {
        this.daoCurrency = daoCurrency;
    }

    @Override
    public void save(List<Currency> currencies) {
        List<Currency> oldCurrencies = daoCurrency.getCurrency();
        if(oldCurrencies==null){
            daoCurrency.saveCurrency(currencies);
        } else {
            List<Currency> currenciesAdd = new LinkedList<>();
            for(Currency currency : currencies){
                boolean newCurrency = true;
                for(Currency oldCurrency : oldCurrencies){
                    if(oldCurrency.getCur_ID()==currency.getCur_ID()){
                        newCurrency = false;
                        if(!oldCurrency.equals(currency)){
                            daoCurrency.remove(oldCurrency.getCur_ID());
                            currenciesAdd.add(currency);
                        }
                        break;
                    }
                }
                if(newCurrency){
                    currenciesAdd.add(currency);
                }
            }
        }
    }

    @Override
    public int getId(String typeCurrency) {
        return daoCurrency.getID(typeCurrency);
    }

    @Override
    public boolean exist(String type) {
        return daoCurrency.exist(type);
    }
}
