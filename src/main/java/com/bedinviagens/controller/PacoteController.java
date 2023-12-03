package com.bedinviagens.controller;

import com.bedinviagens.model.Pacote;
import com.bedinviagens.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;

    // Endpoint para obter todos os pacotes
    @GetMapping
    public List<Pacote> getAllPacotes() {
        return pacoteService.getAllPacotes();
    }

    // Endpoint para obter um pacote por ID
    @GetMapping("/{id}")
    public Pacote getPacoteById(@PathVariable Long id) {
        return pacoteService.getPacoteById(id);
    }

    // Endpoint para criar um novo pacote
    @PostMapping
    public Pacote createPacote(@RequestBody Pacote pacote) {
        return pacoteService.createPacote(pacote);
    }

    // Endpoint para atualizar um pacote existente
    @PutMapping("/{id}")
    public Pacote updatePacote(@PathVariable Long id, @RequestBody Pacote pacote) {
        return pacoteService.updatePacote(id, pacote);
    }

    // Endpoint para excluir um pacote por ID
    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Long id) {
        pacoteService.deletePacote(id);
    }
}
