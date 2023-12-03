package com.bedinviagens.controller;

import com.bedinviagens.model.Cliente;
import com.bedinviagens.repository.ClienteRepository;

import java.io.IOException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    @GetMapping("/listarcliente")
    public ModelAndView listar() {
    	ModelAndView modelAndView = new ModelAndView("cliente/listar.html");
    	 
    	List<Cliente> clientes = clienteRepository.findAll();
        modelAndView.addObject("clientes", clientes);
        
        return modelAndView;
    }

    // chama a view cadastrar e passa um objeto vazio
 	@GetMapping
 	public ModelAndView cadastrar() {
 		ModelAndView modelAndView = new ModelAndView("cliente/cliente.html");
  
 		modelAndView.addObject("cliente", new Cliente());
  
 		return modelAndView;
 	}
  
 	@PostMapping
 	public ModelAndView cadastrar(Cliente cliente) throws IOException {
  		
 		clienteRepository.save(cliente);
 		
 		ModelAndView modelAndView = new ModelAndView("cliente/clientesucesso.html");		
  
 		return modelAndView;
 	}	
 	
 	@GetMapping("/{id}/editar")
 	public ModelAndView editar(@PathVariable Long id) {
 		ModelAndView modelAndView = new ModelAndView("cliente/editar.html");
  
 		Cliente cliente = clienteRepository.getReferenceById(id);
 		modelAndView.addObject("cliente", cliente);
  
 		return modelAndView;
 	}
  
 	@PostMapping("/{id}/editar")
 	public ModelAndView editar(Cliente cliente) {		
  
 		clienteRepository.save(cliente);
 		ModelAndView modelAndView = new ModelAndView("cliente/clientesucesso.html");
  
 		return modelAndView;
 	}
 	
 	@GetMapping("/{id}/excluir")
 	public ModelAndView excluir(@PathVariable Long id) {
 	    ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

 	    Cliente cliente = clienteRepository.getReferenceById(id);
 	    clienteRepository.deleteById(id);

 	    modelAndView.addObject("cliente", cliente);

 	    return modelAndView;
 	}
 	
 	@GetMapping("/consultarPorCPF/{cpf}")
 	public ModelAndView consultarPorCPF(@PathVariable String cpf) {
 	    ModelAndView modelAndView = new ModelAndView("cliente/consultarPorCPF.html");

 	    // Adicione a lógica para consultar o cliente pelo CPF no seu ClienteRepository
 	    Cliente cliente = clienteRepository.findByCpf(cpf);

 	    if (cliente != null) {
 	        modelAndView.addObject("cliente", cliente);
 	    } else {
 	        modelAndView.addObject("mensagem", "Cliente não encontrado para o CPF informado");
 	    }

 	    return modelAndView;
 	}
 }