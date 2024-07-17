package com.alura.forohub.controller;

import com.alura.forohub.model.Topico;
import com.alura.forohub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<Topico> criarTopico(@Valid @RequestBody Topico topico) {
        // Implementación para crear un nuevo tópico
    }

    @GetMapping
    public ResponseEntity<List<Topico>> listarTopicos() {
        // Implementación para listar todos los tópicos
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalharTopico(@PathVariable Long id) {
        // Implementación para obtener detalles de un tópico por ID
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> atualizarTopico(@PathVariable Long id, @Valid @RequestBody Topico topicoAtualizado) {
        // Implementación para actualizar un tópico
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarTopico(@PathVariable Long id) {
        // Implementación para eliminar un tópico
    }
}
