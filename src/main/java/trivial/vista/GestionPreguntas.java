package trivial.vista;

import trivial.modelo.Pregunta;

import java.util.Scanner;

public class GestionPreguntas {

    public static Pregunta altaPregunta(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Introduce el enunciado de la pregunta");
        String enunciado = tc.nextLine();
        System.out.println("Introduce las 3 posibles respuestas");
        System.out.println("1ª Respuesta posible");
        String pregunta1 = tc.nextLine();
        System.out.println("2ª Respuesta posible");
        String pregunta2 = tc.nextLine();
        System.out.println("3º Respuesta posible");
        String pregunta3 = tc.nextLine();
        System.out.println("Introduce el numero de la opcion correcta");
        int respuesta = tc.nextInt();
        return new Pregunta(enunciado,pregunta1,pregunta2,pregunta3,respuesta);
    }
}
