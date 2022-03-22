package trivial_1_1.vista;

public class PreguntaResultado {
	public static void respuestaCorrecta(int puntos) {
		System.out.println("La respuesta es CORRECTA");
		System.out.println("Puntos: "+puntos);
	}
	
	public static void respuestaIncorrecta(int puntos) {
		System.out.println("La respuesta es INCORRECTA");
		System.out.println("Puntos: "+puntos);
	}
}
