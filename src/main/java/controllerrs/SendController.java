package controllerrs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllerrs.api.ISendController;
import core.Currency;
import core.StatisticCurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class SendController implements ISendController {
    private ObjectMapper mapper = new ObjectMapper();
    public SendController() {
    }
    @Override
    public List<StatisticCurrency> sendGetDynamics(String idCurrency, LocalDate dateStart, LocalDate dateEnd) throws IOException {
        List<StatisticCurrency> statisticCurrencies = null;
        StringBuilder urlStringBuilder = new StringBuilder();
        urlStringBuilder.append("https://api.nbrb.by/exrates/rates/dynamics/");
        urlStringBuilder.append(idCurrency);
        urlStringBuilder.append("?startdate=");
        urlStringBuilder.append(dateStart);
        urlStringBuilder.append("&enddate=");
        urlStringBuilder.append(dateEnd);
        URL url = new URL("https://api.nbrb.by/exrates/rates/USD?parammode=2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))){

                 statisticCurrencies = mapper.readValue(bufferedReader.readLine(),
                         new TypeReference<LinkedList<StatisticCurrency>>() {});
            }
        }
        return statisticCurrencies;
    }

    @Override
    public List<Currency> getCurrency() throws IOException {
        LinkedList<Currency> currencies = null;
        URL url = new URL("https://api.nbrb.by/exrates/currencies");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))){
                currencies = mapper.readValue(bufferedReader.readLine(),
                        new TypeReference<LinkedList<Currency>>() {});
            }
        }
        return currencies;
    }
}
