package com.bedinviagens.controller;

import com.bedinviagens.model.Mensagem;
import com.bedinviagens.repository.MensagemRepository;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contato")
public class MensagemController {
	
	@Autowired
    private MensagemRepository mensagemRepository;

	
	// chama a view cadastrar e passa um objeto vazio
	 	@GetMapping
	 	public ModelAndView cadastrar() {
	 		ModelAndView modelAndView = new ModelAndView("contato/contato.html");
	  
	 		modelAndView.addObject("mensagem", new Mensagem());
	  
	 		return modelAndView;
	 	}
	  
	 	@PostMapping
	 	public ModelAndView cadastrar(Mensagem mensagem) throws IOException {
	  		
	 		mensagemRepository.save(mensagem);
	 		
	 		ModelAndView modelAndView = new ModelAndView("contato/contatosucesso.html");		
	  
	 		return modelAndView;
	 	}	
}