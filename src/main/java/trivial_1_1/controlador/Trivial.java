package trivial_1_1.controlador;

import java.util.HashMap;


import trivial_1_1.modelo.*;
import trivial_1_1.vista.*;

public class Trivial {
	public static void jugar() {
		HashMap<Integer, Pregunta> preguntas = PreguntaDAO.leerPreguntasFichero("preguntas.txt");
		int puntos =0;
		
		boolean seguir = true;
		
		while(seguir) {
			int opcion = Menu.menuOpcionesJuego();
			
			switch (opcion) {
				case 1:
					int aleatorio = (int) Math.floor(Math.random()*preguntas.size() + 1);
					
					Pregunta pregunta = preguntas.get(aleatorio);

					int respuesta = PreguntaResponder.preguntar(pregunta);
					if(respuesta == pregunta.getCorrecta()) {
						puntos++;
						PreguntaResultado.respuestaCorrecta(puntos);
					}
					else {
						PreguntaResultado.respuestaIncorrecta(puntos);
					}
					break;
				case 2:
					MostrarPuntos.mensajePuntos(puntos);
					break;
				case 3:
					MostrarPuntos.mensajePuntos(puntos);
					seguir = false;
					break;
				default:
					MostrarError.mensajeError("Indica una opcion correcta");
					break;
			}
		}
	}
	
}
