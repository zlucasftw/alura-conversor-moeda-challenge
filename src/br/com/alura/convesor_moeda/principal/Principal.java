package br.com.alura.convesor_moeda.principal;

import br.com.alura.convesor_moeda.log.CurrencyLog;
import br.com.alura.convesor_moeda.menu.Menu;
import br.com.alura.convesor_moeda.json_converter.Converter;
import br.com.alura.convesor_moeda.modelos.Currency;
import br.com.alura.convesor_moeda.requisicao.Request;

public class Principal {

    public static void main(String[] args) {

        try {

            Menu menu = new Menu();
            Request request = new Request();
            Currency currency;
            int opcao = 0;
            double valor = 0;

            while ((opcao = menu.mostrarMenu()) != 7) {
                valor = menu.mostrarValorConversao();
                String json = request.getJson(opcao, valor);

                if (request.getJson(opcao, valor) == null) {
                    break;
                }

                currency = Converter.getCurrencyFromJson(json);
                menu.mostrarConversao(valor, currency);

                CurrencyLog.salvarLog(currency);
            }
            System.out.println("Até mais!");

        } catch (RuntimeException error) {
            System.out.println(error.getMessage());
        }
    }
}
