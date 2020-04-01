package com.i9.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.i9.eventoapp.models.Evento;
import com.i9.eventoapp.repository.IEventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private IEventoRepository eventoRepository;
	@RequestMapping(value="/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}
	
	
	@RequestMapping(value="/cadastrarEvento", method = RequestMethod.POST)
	public String form(Evento evento) {
		eventoRepository.save(evento);
		
		return "redirect:/cadastrarEvento";
	}
}
