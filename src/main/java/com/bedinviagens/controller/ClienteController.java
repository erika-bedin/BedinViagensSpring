package com.bedinviagens.controller;

import com.bedinviagens.entidades.Cliente;
import com.bedinviagens.servicos.ClienteServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServico clienteServico;

    // Listar todos os clientes
    @GetMapping
    public String listarClientes(Model model) {
        List<Cliente> clientes = clienteServico.listarClientes();
        model.addAttribute("clientes", clientes);
        return "cliente/listar";
    }

    // Exibir formulário para adicionar novo cliente
    @GetMapping("/novo")
    public String exibirFormularioNovoCliente(Model model) {
        Cliente novoCliente = new Cliente();
        model.addAttribute("cliente", novoCliente);
        return "cliente/cliente";
    }

    // Salvar novo cliente
    @PostMapping("/novo")
    public String salvarNovoCliente(@ModelAttribute("cliente") Cliente cliente) {
        clienteServico.salvarCliente(cliente);
        return "redirect:/clientes";
    }

    // Exibir formulário para editar cliente
    @GetMapping("/editar/{id}")
    public String exibirFormularioEditarCliente(@PathVariable Long id, Model model) {
        Cliente cliente = clienteServico.obterCliente(id);
        model.addAttribute("cliente", cliente);
        return "cliente/editar";
    }

    // Atualizar cliente
    @PostMapping("/editar/{id}")
    public String atualizarCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente) {
        cliente.setId(id);
        clienteServico.atualizarCliente(cliente);
        return "redirect:/clientes";
    }

    // Excluir cliente
    @GetMapping("/excluir/{id}")
    public String excluirCliente(@PathVariable Long id) {
        clienteServico.excluirCliente(id);
        return "redirect:/clientes";
    }
}
