package com.literalura.model;

import java.util.List;

public class Book {

    private String title;
    private List<String> authors;  // Puedes cambiarlo a otro tipo según el formato de la API
    private String language;

    // Getters y Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}