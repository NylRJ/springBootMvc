package com.i9.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.i9.eventoapp.models.Evento;

public interface IEventoRepository extends CrudRepository<Evento, String> {
	
	
	Evento findByCodigo(Long codigo);
		
}
