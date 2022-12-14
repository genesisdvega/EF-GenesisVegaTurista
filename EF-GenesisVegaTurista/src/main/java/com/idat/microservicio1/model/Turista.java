package com.idat.microservicio1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "turista")
@Getter
@Setter
public class Turista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;

	private String nombreTurista;

	private String nroCelular;
	private String direccion;

	public Turista() {
		super();
	}

	public Turista(Integer idTurista, String nombreTurista, String nroCelular, String direccion) {
		super();
		this.idTurista = idTurista;
		this.nombreTurista = nombreTurista;
		this.nroCelular = nroCelular;
		this.direccion = direccion;
	}

}
