package dao.fabric;

import dao.DaoCurrency;
import dao.api.IDaoCurrency;

public class DaoCurrencySingleton {
    private static volatile IDaoCurrency instance;

    private DaoCurrencySingleton() {
    }

    public static IDaoCurrency getInstance() {
        if(instance==null){
            synchronized (DaoCurrencySingleton.class){
                if(instance==null){
                    instance = new DaoCurrency();
                }
            }
        }
        return instance;
    }
}
