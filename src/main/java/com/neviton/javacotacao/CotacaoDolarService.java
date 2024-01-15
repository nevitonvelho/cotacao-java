package com.neviton.javacotacao;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotacaoDolarService {

    @Value("${projeto2.api.url}")
    private String projeto2ApiUrl;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public CotacaoDolarService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    @Scheduled(fixedRate = 30 * 60 * 1000) // Chama o método a cada 30 minutos
    public void agendarObtencaoCotacaoDolar() {
        obterCotacaoDolar();
    }

    private void obterCotacaoDolar() {
        System.out.println("Solicitando cotação do dólar...");
        try {
            String response = restTemplate.getForObject(projeto2ApiUrl, String.class);

            if (response != null && !response.isEmpty()) {
                JsonNode jsonNode = objectMapper.readTree(response);

                if (jsonNode.has("cotacao_dolar")) {
                    String cotacaoDolar = jsonNode.get("cotacao_dolar").asText();
                    System.out.println("Cotação do dólar recebida: " + cotacaoDolar);
                } else {
                    System.out.println("Resposta da API do Projeto 2 não contém o campo 'cotacao_dolar'.");
                }
            } else {
                System.out.println("Resposta da API do Projeto 2 é nula ou vazia.");
            }
        } catch (Exception e) {
            System.err.println("Erro ao obter cotação do dólar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
