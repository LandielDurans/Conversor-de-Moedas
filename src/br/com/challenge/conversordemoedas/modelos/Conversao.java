package br.com.challenge.conversordemoedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversao {
    public void Converter(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/f0c52b43d98312547f4745e3/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor)).
                build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        CamposMoedas camposMoedas = gson.fromJson(response.body(), CamposMoedas.class);
        System.out.println("\n Resultado da operacão");
        System.out.println("Valor de " + valor + " convertido de " + moedaOrigem + " para " + moedaDestino + " é de " + camposMoedas.conversion_result() + "\n");
    }
}
