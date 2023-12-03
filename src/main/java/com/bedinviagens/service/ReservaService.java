package com.bedinviagens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bedinviagens.model.Cliente;
import com.bedinviagens.model.Pacote;
import com.bedinviagens.model.Reserva;
import com.bedinviagens.repository.ClienteRepository;
import com.bedinviagens.repository.PacoteRepository;

@Service
public class ReservaService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PacoteRepository pacoteRepository;

    public Reserva criarReserva(Long idCliente, Long idPacote) {
        Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
        Pacote pacote = pacoteRepository.findById(idPacote).orElse(null);

        if (cliente != null && pacote != null) {
            return new Reserva(cliente, pacote);
        } else {
            // Lógica de tratamento se o cliente ou pacote não forem encontrados
            return null;
        }
    }
}
