package com.example.generaciones.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.generaciones.model.Empleado;
import com.example.generaciones.model.Estudiante;
import com.example.generaciones.model.Persona;
import com.example.generaciones.service.PersonaService;

@Controller
public class PersonaController {
	
	private final PersonaService personaService;


    public PersonaController(
            PersonaService personaService) {

        this.personaService = personaService;

    }


    @GetMapping("/")
    public String inicio() {

        return "index";

    }


    @PostMapping("/procesar")
    public String procesar(

            @RequestParam String nombre,

            @RequestParam String apellido,
            
            @RequestParam String correo,

            @RequestParam LocalDate fechaNacimiento,
            
            @RequestParam String sexo,
            
            @RequestParam String facultad,

            @RequestParam String tipo,

            @RequestParam String ocupacion,

            Model model) {


        Persona persona;


        if (tipo.equals("estudiante")) {

            persona =
                new Estudiante(
                    nombre,
                    apellido,
                    correo,
                    facultad,
                    fechaNacimiento,
                    ocupacion
                );

        } else {

            persona =
                new Empleado(
                    nombre,
                    apellido,
                    correo,
                    facultad,
                    fechaNacimiento,
                    ocupacion
                );

        }


        int edad =
            personaService
            .calcularEdad(persona);


        String generacion =
            personaService
            .determinarGeneracion(persona);
        
        String descGeneracion =
        		personaService
        		.obtenerDescripcionGeneracion(persona);

        String imgGeneracion =
        		personaService
        		.obtenerImagenGeneraciones(persona);

        model.addAttribute(
            "persona",
            persona
        );
        
        model.addAttribute(
             "correo",
             correo
        );
        
        model.addAttribute(
        		"sexo",
        		sexo
        );


        model.addAttribute(
            "edad",
            edad
        );
        
        model.addAttribute(
        		"facultad",
        		facultad
        );


        model.addAttribute(
            "generacion",
            generacion
        );
        
        model.addAttribute(
        		"descGeneracion",
        		descGeneracion
        );


        model.addAttribute(
            "ocupacion",
            ocupacion
        );
        
        model.addAttribute(
        		"imgGeneracion",
        		imgGeneracion
        );


        return "resultado";
        
        
        

    }




}
