package com.bedinviagens.service;

import com.bedinviagens.model.Pacote;
import com.bedinviagens.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    // Método para obter todos os pacotes
    public List<Pacote> getAllPacotes() {
        return pacoteRepository.findAll();
    }

    // Método para obter um pacote por ID
    public Pacote getPacoteById(Long id) {
        Optional<Pacote> pacoteOptional = pacoteRepository.findById(id);
        return pacoteOptional.orElse(null);
    }

    // Método para criar um novo pacote
    public Pacote createPacote(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    // Método para atualizar um pacote existente
    public Pacote updatePacote(Long id, Pacote pacote) {
        pacote.setId(id);
        return pacoteRepository.save(pacote);
    }

    // Método para excluir um pacote por ID
    public void deletePacote(Long id) {
        pacoteRepository.deleteById(id);
    }
}
