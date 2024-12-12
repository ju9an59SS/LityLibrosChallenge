package com.example.Literatura.repositorios;

import com.example.Literatura.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    // Aquí puedes añadir consultas personalizadas si es necesario
}

