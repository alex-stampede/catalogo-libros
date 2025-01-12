package com.literalura.model;

import java.util.List;

public class GutendexResponse {

    private List<Book> results; // Lista de libros obtenidos de la API

    public List<Book> getResults() {
        return results;
    }

    public void setResults(List<Book> results) {
        this.results = results;
    }
}