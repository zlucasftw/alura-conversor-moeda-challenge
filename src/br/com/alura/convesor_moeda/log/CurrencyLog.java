package br.com.alura.convesor_moeda.log;

import br.com.alura.convesor_moeda.json_converter.Converter;
import br.com.alura.convesor_moeda.modelos.Currency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class CurrencyLog {

    public static void salvarLog(Currency currency) {

        try {
            String json = Converter.getCurrencyToJson(currency);
            // BufferedWriter writer = new BufferedWriter(new FileWriter(Date.from(Instant.ofEpochSecond(currency.time_last_update_unix())) + ".json", true));
            BufferedWriter writer = new BufferedWriter(new FileWriter(currency.time_last_update_unix() + ".json", true));
            // writer.write(json + ",");
            // writer.append("[");
            writer.write(json);
            // writer.append("],");
            writer.close();
        } catch (IOException error) {
            throw new RuntimeException("Erro na gravação de log.");
        }

    }

}
