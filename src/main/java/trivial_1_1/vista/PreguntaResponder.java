package trivial_1_1.vista;

import java.util.Scanner;

import trivial_1_1.modelo.Pregunta;

public class PreguntaResponder {
	public static int preguntar(Pregunta pregunta) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿"+pregunta.getEnunciado()+"?");
		System.out.println("1- "+pregunta.getRespuesta1());
		System.out.println("2- "+pregunta.getRespuesta2());
		System.out.println("3- "+pregunta.getRespuesta3());
		System.out.print(">");
		int respuesta = sc.nextInt();
		
		return respuesta;		
	}
}
