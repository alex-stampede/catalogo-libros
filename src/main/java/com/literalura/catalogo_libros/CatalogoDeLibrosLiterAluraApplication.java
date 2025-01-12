package com.literalura.catalogo_libros;

import com.literalura.service.BookService;
import com.literalura.service.MenuService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatalogoDeLibrosLiterAluraApplication implements CommandLineRunner {

	private final MenuService menuService;

	// Constructor para inyectar MenuService
	public CatalogoDeLibrosLiterAluraApplication(MenuService menuService) {
		this.menuService = menuService;
	}

	public static void main(String[] args) {
		// Inicia la aplicación Spring Boot
		SpringApplication.run(CatalogoDeLibrosLiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Llamar a menuService para mostrar el menú al iniciar la aplicación
		menuService.displayMenu();
	}
}