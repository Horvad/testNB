package controllerrs.api;

import core.Currency;
import core.StatisticCurrency;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface ISendController {
    List<StatisticCurrency> sendGetDynamics(String idCurrency, LocalDate dateStart, LocalDate dateEnd) throws IOException;
    List<Currency> getCurrency() throws IOException;
}
