package com.example.generaciones.model;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	private String departamento;


    public Empleado() {
        super();
    }


    public Empleado(
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
            fechaNacimiento
        );

        this.departamento = departamento;

    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(
            String departamento) {

        this.departamento = departamento;

    }


    @Override
    public String getTipoPersona() {

        return "Empleado";

    }



}
