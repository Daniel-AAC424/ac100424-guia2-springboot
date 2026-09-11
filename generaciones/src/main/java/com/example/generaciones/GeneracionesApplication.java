package com.example.generaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.generaciones.model.PersonaLista;



@SpringBootApplication
public class GeneracionesApplication {
	


	public static void main(String[] args) {
		
		
		SpringApplication.run(GeneracionesApplication.class, args);
		
		PersonaLista lista = new PersonaLista();
	    lista.mostrarPersonas();
	    
	
		
	}

}
