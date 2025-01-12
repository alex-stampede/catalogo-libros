package com.literalura.entity;

import jakarta.persistence.*;
import org.hibernate.mapping.List;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String authors;

    private String language;

    // Constructor por defecto (requerido por JPA)
    public BookEntity(String title, List authors, String language) {
    }

    // Constructor con parámetros
    public BookEntity(String title, String authors, String language) {
        this.title = title;
        this.authors = authors;
        this.language = language;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}