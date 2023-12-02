package com.bedinviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/floripa")
public class FloripaController {
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/floripa.html");
		return page;
	}
}