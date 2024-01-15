package com.neviton.javacotacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotacaoDolarService {

    @Value("${projeto2.api.url}")
    private String projeto2ApiUrl;

    private final RestTemplate restTemplate;

    public CotacaoDolarService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void obterCotacaoDolar() {
        System.out.println("Solicitando cotação do dólar...");
        System.out.println("URL da API do Projeto 2: " + projeto2ApiUrl);

        try {
            String response = restTemplate.getForObject(projeto2ApiUrl, String.class);

            if (response != null && !response.isEmpty()) {
                System.out.println("Cotação do dólar recebida: " + response);
            } else {
                System.out.println("Resposta da API do Projeto 2 é nula ou vazia.");
            }
        } catch (Exception e) {
            System.err.println("Erro ao obter cotação do dólar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

