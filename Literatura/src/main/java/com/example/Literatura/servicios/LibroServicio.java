package com.example.Literatura.servicios;

import com.example.Literatura.modelos.Libro;
import com.example.Literatura.modelos.ResultadoLibros;
import com.example.Literatura.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LibroServicio {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LibroRepositorio libroRepositorio; // Inyección del repositorio para acceder a la base de datos

    private static final String URL_API = "https://gutendex.com/books?search=";

    // Método para obtener todos los libros desde la base de datos
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepositorio.findAll(); // Obtenemos todos los libros desde la base de datos
    }

    // Método para obtener libros por título desde la API externa
    public ResultadoLibros obtenerLibrosPorTitulo(String titulo) {
        String url = URL_API + titulo;
        return restTemplate.getForObject(url, ResultadoLibros.class);
    }
}
