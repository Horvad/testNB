package servise;

import controllerrs.api.ISendController;
import core.Currency;
import core.StatisticCurrency;
import servise.api.IServiceSend;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ServiceSend implements IServiceSend {
    private final ISendController sendController;

    public ServiceSend(ISendController sendController) {
        this.sendController = sendController;
    }

    @Override
    public List<StatisticCurrency> sendGetDynamics(String idCurrency, LocalDate dateStart, LocalDate dateEnd) {
        try {
            return sendController.sendGetDynamics(idCurrency,dateStart,dateEnd);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Currency> getCurrency() {
        try {
            return sendController.getCurrency();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
