package br.com.alura.convesor_moeda.principal;

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
            } // String json = Request.fetchMoeda("USD", "BRL", 10);


//            System.out.println(currency);
//            System.out.println("Valor 10 [USD] corresponde ao valor final de =>>> " + currency.conversion_result() + " [BRL]");
//            System.out.println("Valor " +  10 + " [" + currency.base_code() + "] corresponde ao valor final de =>>> " + currency.conversion_result() + " [" + currency.target_code() + "]");
        } catch (RuntimeException error) {
            System.out.println(error.getMessage());
        }
    }
}
