package servise.fabric;

import servise.ServiceCurrency;
import servise.api.IServiceCurrency;
import servise.api.IServiceStatistic;

public class ServiceCurrencySingleton {
    private static volatile IServiceCurrency instance;

    private ServiceCurrencySingleton() {
    }

    public static IServiceCurrency getInstance() {
        if(instance==null){
            synchronized (ServiceCurrencySingleton.class){
                if(instance==null){
                    instance = new ServiceCurrency();
                }
            }
        }
        return instance;
    }
}
