package com.literalura.service;

import com.literalura.entity.BookEntity;
import org.springframework.stereotype.Service;
import com.literalura.model.Book;

@Service
public class MenuService {

    private final BookService bookService;

    // Constructor que recibe BookService para ser inyectado
    public MenuService(BookService bookService) {
        this.bookService = bookService;
    }

    // Metodo para mostrar el menú de opciones al usuario
    public void displayMenu() {
        System.out.println("Bienvenido a LiterAlura - Catálogo de Libros");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Buscar libro por título");
        System.out.println("2. Buscar libro por autor");
        System.out.println("3. Ver todos los libros");
        System.out.println("4. Salir");

        // Aquí puedes añadir la lógica para leer la opción y ejecutar las acciones correspondientes
        // Ejemplo simple para mostrar la lista de libros:
        listAllBooks();
    }

    // Método que muestra todos los libros disponibles
    public void listAllBooks() {
        System.out.println("Libros disponibles:");
        for (BookEntity book : bookService.getAllBooks()) {
            System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthors());
        }
    }

    // Otros métodos de interacción pueden añadirse, como búsqueda por título o autor
}