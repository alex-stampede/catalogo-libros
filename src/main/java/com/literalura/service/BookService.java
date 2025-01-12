package com.literalura.service;

import com.literalura.entity.BookEntity;
import com.literalura.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Metodo para buscar libros por título
    public List<BookEntity> searchAndSaveBooksByTitle(String title) {
        // Aquí llamas a la API para obtener los libros por título
        // Este es solo un ejemplo; implementa la llamada a la API de Gutendex.
        return List.of();  // Devuelve los libros encontrados (vacío por ahora)
    }

    // Metodo para obtener todos los libros almacenados
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    // Metodo para obtener libros por idioma
    public List<BookEntity> getBooksByLanguage(String language) {
        return bookRepository.findByLanguage(language);
    }

    // Metodo para eliminar todos los libros almacenados
    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }
}