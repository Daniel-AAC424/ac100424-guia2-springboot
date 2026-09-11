package com.example.generaciones.model;

import java.time.LocalDate;

public class Docente extends Persona{
	
	private String facultad;
	
	public Docente() {
		super();
	}
	
	public Docente(
			String nombre,
			String apellido,
			String correo,
			String facultad,
			LocalDate fechaNacimiento,
			String departamento) {
		super(
				nombre,
				apellido,
				correo,
				facultad,
				fechaNacimiento);
		this.facultad = facultad;
	}
	
	public String getFacultad() {
		return facultad;
	}
	
	public void setFacultad(
			String facultad) {
		this.facultad = facultad;
	}
	
	@Override
	public String getTipoPersona() {
		return "Docente";
	}

}
