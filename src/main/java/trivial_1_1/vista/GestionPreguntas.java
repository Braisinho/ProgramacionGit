package trivial_1_1.vista;

import java.util.ArrayList;
import java.util.Scanner;

import trivial_1_1.modelo.Pregunta;

public class GestionPreguntas {

    public static Pregunta altaPregunta() {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int correcta = -1;

        System.out.println("Indica el enunciado:");
        System.out.print(">");
        String enunciado = sc.nextLine();
        if ( enunciado.length() == 0 ) return null;

        System.out.println("Primera respuesta");
        System.out.print("1 >");
        String respuesta1 = sc.nextLine();

        System.out.println("Segunda respuesta");
        System.out.print("2 >");
        String respuesta2 = sc.nextLine();

        System.out.println("Tercera respuesta");
        System.out.print("3 >");
        String respuesta3 = sc.nextLine();

        // pido al usuario la opcion correcta hasta quue indica una valida
        do {

            System.out.println("Numero de respuesta correcta");
            System.out.print(">");
            correcta = sc.nextInt();

            if (correcta > 0 && correcta < 4) {
                seguir = false;
            } else {
                System.out.println("Indica un número entre 1 y 3");
            }

        } while (seguir);
/*
        System.out.println("Numero de respuesta correcta");
        System.out.print(">");
        int correcta = sc.nextInt();
*/

        
        return new Pregunta(enunciado, respuesta1, respuesta2, respuesta3, correcta);
    }
    
    // Mientras no se introduzca un valor vacio en
    public static ArrayList<Pregunta> altaPreguntas(){
        Pregunta nuevaPregunta;
        ArrayList<Pregunta> listaPreguntas = new ArrayList();
        do {
           nuevaPregunta = altaPregunta();
           listaPreguntas.add(nuevaPregunta);
        } while (nuevaPregunta != null);
        return listaPreguntas;
    }

}
