package com.bedinviagens.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bedinviagens.model.Cliente;
import com.bedinviagens.model.Pacote;
import com.bedinviagens.model.Reserva;
import com.bedinviagens.repository.ClienteRepository;
import com.bedinviagens.repository.PacoteRepository;
import com.bedinviagens.repository.ReservaRepository;
import com.bedinviagens.service.ReservaService;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PacoteRepository pacoteRepository;

    @Autowired
    private ReservaService reservaService;

    // Listar todas as reservas
    @GetMapping("/listarreserva")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("reserva/listar.html");

        List<Reserva> reservas = reservaRepository.findAll();
        System.out.println("Lista de Reservas: " + reservas);
        modelAndView.addObject("reservas", reservas);

        return modelAndView;
    }

    @GetMapping
    public ModelAndView exibirFormularioReserva(@RequestParam(required = false) Long idCliente, @RequestParam(required = false) Long idPacote) {
        ModelAndView modelAndView = new ModelAndView("reserva/reserva.html");
        
        modelAndView.addObject("pacotes", pacoteRepository.findAll());

        if (idCliente != null && idPacote != null) {
            Pacote pacote = pacoteRepository.getReferenceById(idPacote).orElse(null);
            Cliente cliente = clienteRepository.getReferenceById(idCliente).orElse(null);

            modelAndView.addObject("reserva", new Reserva(cliente, pacote));
        } else {
            modelAndView.addObject("reserva", new Reserva());
        }

        return modelAndView;
    }

    @PostMapping
    public ModelAndView cadastrarReserva(@RequestParam Long idCliente, @RequestParam Long idPacote) throws IOException {
        Reserva reserva = reservaService.criarReserva(idCliente, idPacote);

        if (reserva != null) {
            reservaRepository.save(reserva);
            ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");
            return modelAndView;
        } else {
            // Lógica de tratamento se a reserva não puder ser criada
            ModelAndView modelAndView = new ModelAndView("reserva/reservaerro.html");
            return modelAndView;
        }
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("reserva/editar.html");

        Reserva reserva = reservaRepository.findById(id).orElse(null);
        modelAndView.addObject("reserva", reserva);

        return modelAndView;
    }

    @PostMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id, Reserva reserva) {
        reservaRepository.save(reserva);
        ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");
        return modelAndView;
    }

    @GetMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("reserva/reservasucesso.html");

        Reserva reserva = reservaRepository.findById(id).orElse(null);
        reservaRepository.deleteById(id);

        modelAndView.addObject("reserva", reserva);

        return modelAndView;
    }
}
