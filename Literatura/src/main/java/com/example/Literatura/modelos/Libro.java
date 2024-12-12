package com.example.Literatura.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Si deseas usar Lombok para los getters y setters
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter  // Lombok genera los getters automáticamente
@Setter  // Lombok genera los setters automáticamente
public class Libro {

    // Declaramos el campo 'id', que faltaba
    private Long id;

    private String title;
    private String language;
    private String author;

    // Los getters y setters se generan automáticamente con Lombok
    // Ya no es necesario escribirlos manualmente
}
