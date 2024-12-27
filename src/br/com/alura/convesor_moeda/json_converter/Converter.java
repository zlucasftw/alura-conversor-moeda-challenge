package br.com.alura.convesor_moeda.json_converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import br.com.alura.convesor_moeda.modelos.Currency;

public class Converter {

    public static Currency getCurrencyFromJson(String json) {

        try {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            return gson.fromJson(json, Currency.class);
        } catch (NullPointerException error) {
            throw new RuntimeException("Erro na serialização da moeda");
        } catch (Exception error) {
            throw new RuntimeException("Erro geral na aplicação.");
        }
    }

}
