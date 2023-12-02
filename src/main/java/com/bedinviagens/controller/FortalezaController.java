package com.bedinviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fortaleza")
public class FortalezaController {
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/fortaleza.html");
		return page;
	}
}