package com.idat.microservicio1.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TuristaDTO {

	private Integer idTurista;

	private String nombreTurista;

	private String nroCelular;
	private String direccion;

	public TuristaDTO() {
		super();
	}

	public TuristaDTO(Integer idTurista, String nombreTurista, String nroCelular, String direccion) {
		super();
		this.idTurista = idTurista;
		this.nombreTurista = nombreTurista;
		this.nroCelular = nroCelular;
		this.direccion = direccion;
	}

}
