package com.literalura;

import com.literalura.entity.BookEntity;
import com.literalura.service.BookService;

import java.util.List;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        System.out.println("¡Bienvenido al Catálogo de Libros LiterAlura!");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Buscar libros por título");
        System.out.println("2. Mostrar todos los libros almacenados");
        System.out.println("3. Filtrar libros por idioma");
        System.out.println("4. Eliminar todos los libros almacenados");
        System.out.println("5. Salir");

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIngrese su opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el título del libro que desea buscar: ");
                    String titulo = scanner.nextLine();
                    List<BookEntity> librosEncontrados = bookService.searchAndSaveBooksByTitle(titulo);
                    if (librosEncontrados.isEmpty()) {
                        System.out.println("No se encontraron libros con el título: " + titulo);
                    } else {
                        System.out.println("Libros encontrados:");
                        for (BookEntity libro : librosEncontrados) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case "2":
                    System.out.println("Libros almacenados:");
                    List<BookEntity> libros = bookService.getAllBooks();
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros almacenados.");
                    } else {
                        for (BookEntity libro : libros) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Ingrese el idioma para filtrar los libros (ejemplo: 'en', 'es'): ");
                    String idioma = scanner.nextLine();
                    List<BookEntity> librosPorIdioma = bookService.getBooksByLanguage(idioma);
                    if (librosPorIdioma.isEmpty()) {
                        System.out.println("No se encontraron libros en el idioma: " + idioma);
                    } else {
                        System.out.println("Libros en idioma " + idioma + ":");
                        for (BookEntity libro : librosPorIdioma) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case "4":
                    bookService.deleteAllBooks();
                    System.out.println("Todos los libros almacenados han sido eliminados.");
                    break;

                case "5":
                    System.out.println("¡Gracias por usar el Catálogo de Libros LiterAlura!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }

        scanner.close();
    }
}