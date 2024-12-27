package br.com.alura.convesor_moeda.requisicao;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    private String fetchMoeda(String codigoBase, String codigoAlvo, double valor) {
        try {

            URI url = URI.create("https://v6.exchangerate-api.com/v6/9dd8ac587df4e49804fc2621/pair/" + codigoBase
                    + "/" + codigoAlvo + "/" + valor);

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (IOException | InterruptedException | UncheckedIOException error) {
            throw new RuntimeException("Erro na requisição");
        } catch (IllegalArgumentException error) {
            throw new RuntimeException("Erro em algum valor para conversão. Tente novamente ou outros valores.");
        } catch (Exception erro) {
            throw new RuntimeException("Erro geral na aplicação.");
        }
    }

    public String getJson(int opcao, double valor) {

        switch (opcao) {
            case 1:
                return fetchMoeda("USD", "ARS", valor);
            case 2:
                return fetchMoeda("ARS", "USD", valor);
            case 3:
                return fetchMoeda("USD", "BRL", valor);
            case 4:
                return fetchMoeda("BRL", "USD", valor);
            case 5:
                return fetchMoeda("USD", "COP", valor);
            case 6:
                return fetchMoeda("COP", "USD", valor);
            case 7:

            default:
                return null;
        }
    }

}
