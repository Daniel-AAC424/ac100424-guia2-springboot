package com.example.generaciones.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.example.generaciones.model.Persona;

@Service	
public class PersonaService {
	
	public int calcularEdad(Persona persona) {

        LocalDate hoy = LocalDate.now();

        return Period.between(
            persona.getFechaNacimiento(),
            hoy
        ).getYears();

    }


    public String determinarGeneracion(
            Persona persona) {

        int anio =
            persona
            .getFechaNacimiento()
            .getYear();


        if (anio >= 2025) {

            return "Generación Beta";

        } else if (anio >= 2013) {

            return "Generación Alpha";

        } else if (anio >= 1997) {

            return "Generación Z";

        } else if (anio >= 1981) {

            return "Millennial";

        } else if (anio >= 1965) {

            return "Generación X";

        } else if (anio >= 1946) {

            return "Baby Boomer";

        } else if (anio >= 1928) {

            return "Generación Silenciosa";

        } else {

            return "Generación anterior";

        }

    }
    
    public String obtenerDescripcionGeneracion(
    		Persona persona) {
    	
    	int anio =
                persona
                .getFechaNacimiento()
                .getYear();


            if (anio >= 2025) {

                return "Quienes nazcan a partir de 2025 crecerán en una sociedad totalmente digitalizada, donde la inteligencia artificial, la automatización y los entornos virtuales serán parte natural de su vida cotidiana.";

            } else if (anio >= 2013) {

                return "Los niños de este periodo han nacido en un entorno extremadamente tecnológico y globalizado, en el que además han vivido el impacto de la pandemia en sus primeros años de desarrollo. ";

            } else if (anio >= 1997) {

                return "Los jóvenes actuales son nativos digitales completos, profundamente influidos por las redes sociales, los dispositivos conectados y la comunicación instantánea. ";

            } else if (anio >= 1981) {

                return "Los primeros verdaderos nativos digitales se enfrentaron a empleos más inestables y a mayores dificultades para acceder a una vivienda, aunque han disfrutado de una vida social más orientada al ocio, los viajes y la experiencia.";

            } else if (anio >= 1965) {

                return "Vivieron una época de prosperidad y expansión del consumo, acompañada de la llegada de los primeros ordenadores y de una modernización tecnológica que transformó su día a día. ";

            } else if (anio >= 1946) {

                return "Crecieron en una etapa de fuerte crecimiento económico y estabilidad laboral que impulsó la natalidad. El trabajo, la seguridad y formar una familia fueron los valores centrales de su generación. ";

            } else if (anio >= 1928) {

                return "Nacieron en un período marcado por la guerra y la escasez, lo que les llevó a adoptar la austeridad, la disciplina y el esfuerzo como pilares fundamentales de su forma de vida. ";

            } else {

                return "Generación anterior, No definida";

            }

    	//descripcion obtenida de https://www.enterat.com/actualidad/generaciones-anos-edad-nombres.php
    }
    
    public String obtenerImagenGeneraciones(
    		Persona persona) {
    	
        int anio =
                persona
                .getFechaNacimiento()
                .getYear();


            if (anio >= 2025) {

                return "images/genbeta";

            } else if (anio >= 2013) {

                return "images/genalfa.jpg";

            } else if (anio >= 1997) {

                return "images/genz.jpg";

            } else if (anio >= 1981) {

                return "images/millenial.jpg";

            } else if (anio >= 1965) {

                return "images/genx";

            } else if (anio >= 1946) {

                return "images/babyboomer.jpg";

            } else if (anio >= 1928) {

                return "images/gensilenciosa.jpg";

            } else {

                return "Generación anterior";

            }
    	
    }
    
    


}
