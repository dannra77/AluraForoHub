package com.alura.forohub.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String titulo;

    @NotNull
    @NotEmpty
    private String mensaje;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    @NotNull
    @NotEmpty
    private String status;

    @NotNull
    @NotEmpty
    private String autor;

    @NotNull
    @NotEmpty
    private String curso;

    // getters y setters
}
