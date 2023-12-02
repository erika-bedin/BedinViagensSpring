package com.bedinviagens.controller;

import java.io.IOException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bedinviagens.entidades.Reserva;
import com.bedinviagens.repository.ReservaRepository;
 
@Controller
@RequestMapping("/reserva")
public class ReservaController {
 
	@Autowired
	private ReservaRepository reservaRepository;

	// lista todos os dados do banco contato
	@GetMapping("/listarreserva")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("reserva/listar.html");
 
		List<Reserva> reservas = reservaRepository.findAll();
		modelAndView.addObject("reservas", reservas);
 
		return modelAndView;
	}
 
	// chama a view cadastrar e passa um objeto vazio
	@GetMapping("/reserva")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("reserva/reserva.html");
 
		modelAndView.addObject("reserva", new Reserva());
 
		return modelAndView;
	}
 
	@PostMapping("/reserva")
	public ModelAndView cadastrar(Reserva reserva) throws IOException {
 		
		reservaRepository.save(reserva);
		
		ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");		
 
		return modelAndView;
	}	
	
	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("reserva/editar.html");
 
		Reserva reserva = reservaRepository.getReferenceById(id);
		modelAndView.addObject("reserva", reserva);
 
		return modelAndView;
	}
 
	@PostMapping("/{id}/editar")
	public ModelAndView editar(Reserva reserva) {		
 
		reservaRepository.save(reserva);
		ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");
 
		return modelAndView;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
	    ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");

	    Reserva reserva = reservaRepository.getReferenceById(id);
	    reservaRepository.deleteById(id);

	    modelAndView.addObject("reserva", reserva);

	    return modelAndView;
	}
}