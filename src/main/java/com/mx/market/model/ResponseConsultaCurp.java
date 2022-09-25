package com.mx.market.model;

import lombok.Data;

@Data
public class ResponseConsultaCurp {

	private String nombre;
	private String apellidop;
	private String apellidom;
	private int edad;
	private String nacionalidad;
	private String escolaridad;
	private Boolean vacunado;
	
}
