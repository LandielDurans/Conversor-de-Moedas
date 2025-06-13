package br.com.challenge.conversordemoedas.modelos;

public record CamposMoedas(
        String base_code,
        String target_code,
        double conversion_result) {
}