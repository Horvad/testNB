package dao.fabric;

import dao.DaoStatistic;
import dao.api.IDaoStatisticCurrency;
import dao.api.IDaoCurrency;

public class DaoStatisticSingleton {
    private static volatile IDaoStatisticCurrency instance;

    private DaoStatisticSingleton() {
    }

    public static IDaoStatisticCurrency getInstance() {
        if(instance==null){
            synchronized (DaoStatisticSingleton.class){
                if(instance==null){
                    instance = new DaoStatistic();
                }
            }
        }
        return instance;
    }
}
