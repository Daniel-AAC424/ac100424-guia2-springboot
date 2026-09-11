package com.example.generaciones.model;

import java.time.LocalDate;

public class Estudiante extends Persona{
	
	private String carrera;


    public Estudiante() {
        super();
    }


    public Estudiante(
            String nombre,
            String apellido,
            String correo,
            String facultad,
            LocalDate fechaNacimiento,
            String carrera) {

        super(
            nombre,
            apellido,
            correo,
            facultad,
            fechaNacimiento
        );

        this.carrera = carrera;

    }


    public String getCarrera() {
        return carrera;
    }


    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String getTipoPersona() {

        return "Estudiante";

    }



}
