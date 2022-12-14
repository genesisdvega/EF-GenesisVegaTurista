package com.idat.microservicio1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicio1.dto.TuristaDTO;
import com.idat.microservicio1.model.Turista;
import com.idat.microservicio1.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listadto = new ArrayList<TuristaDTO>();
	

		for (Turista turista : repository.findAll()) {
			TuristaDTO dto = new TuristaDTO();
			dto.setIdTurista(turista.getIdTurista());
			dto.setNombreTurista(turista.getNombreTurista());
			dto.setNroCelular(turista.getNroCelular());
			dto.setDireccion(turista.getDireccion());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public void guardar(TuristaDTO dto) {
		Turista turista = new Turista(dto.getIdTurista(), dto.getNombreTurista(), dto.getNroCelular(),
				dto.getDireccion());
		repository.save(turista);

	}

}
