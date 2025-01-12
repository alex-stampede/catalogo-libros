package com.literalura.repository;

import com.literalura.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;  // Asegúrate de importar esta clase

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByLanguage(String language); // Metodo para filtrar por idioma
}