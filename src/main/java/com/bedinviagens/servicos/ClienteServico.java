package com.bedinviagens.servicos;

import com.bedinviagens.entidades.Cliente;
import com.bedinviagens.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obterCliente(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.orElse(null);
    }

    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
        if (cliente.getId() != null) {
            clienteRepository.save(cliente);
        }
    }

    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
