package com.idat.microservicio1.service;

import java.util.List;

import com.idat.microservicio1.dto.TuristaDTO;

public interface TuristaService {
	List<TuristaDTO> listar();

	void guardar(TuristaDTO reserva);

}
