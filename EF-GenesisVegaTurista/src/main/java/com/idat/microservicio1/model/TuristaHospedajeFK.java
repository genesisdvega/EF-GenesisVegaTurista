package com.idat.microservicio1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class TuristaHospedajeFK implements Serializable {

	private static final long serialVersionUID = 1538366447681778607L;

	@Column(name = "idturista", nullable = false)
	private Integer idTurista;

	@Column(name = "idhospedaje", nullable = false)
	private Integer idHospedaje;
}
