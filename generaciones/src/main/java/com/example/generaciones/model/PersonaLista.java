package com.example.generaciones.model;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class PersonaLista {
	
    private List<Persona> personas=
        	new ArrayList<>();
    
    public PersonaLista() {
    	
    	personas.add(
    			new Estudiante(
    					"Daniel",
    					"Ayala",
    					"danielcorreo@gmail.com",
    					"Ingenieria y Sistemas",
    					LocalDate.of(2006, 02 ,15),
    					"Ingenieria en Ciencias de la Computacion"
    					)
    			);
    	personas.add(
    	
    			new Empleado(
    					"Alejandro",
    					"Centeno",
    					"alejandrocorreo@gmail.com",
    					"Ingienieria y Sistemas",
    					LocalDate.of(2006, 01 ,15),    					
    					"Ingenieria"
    					)
    			);
    	personas.add(
    	    	
    			new Docente(
    					"Daniel Alejandro",
    					"Ayala Centeno",
    					"alejandrodanielcorreo@gmail.com",
    					"Ingienieria y Sistemas",
    					LocalDate.of(2006, 03 ,15),    					
    					"Ingenieria"
    					)
    			);
    	
    }

    public void mostrarPersonas() {
    	for (Persona persona : personas) {
    		System.out.println(
    				 persona.getTipoPersona() + ": " +
    				 persona.getNombreCompleto() + " - " +
    				 persona.getCorreo()
    				 );
    	}
    }

}
