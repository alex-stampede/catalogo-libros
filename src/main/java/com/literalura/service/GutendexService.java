package com.literalura.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.literalura.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
public class GutendexService {
    private final WebClient webClient;
    private final ObjectMapper objectMapper;

    public GutendexService(WebClient.Builder webClientBuilder, ObjectMapper objectMapper) {
        this.webClient = webClientBuilder.baseUrl("https://gutendex.com").build();
        this.objectMapper = objectMapper;
    }

    public List<Book> searchBooks(String query) {
        String response = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/books/").queryParam("search", query).build())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        try {
            Map<String, Object> jsonMap = objectMapper.readValue(response, new TypeReference<>() {});
            return objectMapper.convertValue(jsonMap.get("results"), new TypeReference<>() {});
        } catch (Exception e) {
            throw new RuntimeException("Error al procesar la respuesta de la API", e);
        }
    }
}