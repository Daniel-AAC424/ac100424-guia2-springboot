package com.example.generaciones.model;

import java.time.LocalDate;


public abstract class Persona {

    private String nombre;

    private String apellido;
    
    private String correo;
    
    private String facultad;

    private LocalDate fechaNacimiento;
    
    public Persona() {
    	
    }

    public Persona(
            String nombre,
            String apellido,
            String correo,
            String facultad,
            LocalDate fechaNacimiento) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.facultad = facultad;
        this.fechaNacimiento = fechaNacimiento;

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFacultad() {
        return facultad;
    }


    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(
            LocalDate fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;

    }


    public String getNombreCompleto() {

        return nombre + " " + apellido;
        

    }


    public abstract String getTipoPersona();
    


	
}
