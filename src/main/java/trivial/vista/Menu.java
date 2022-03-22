package trivial.vista;

import trivial.modelo.PreguntaDAO;

import java.io.File;
import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner tc = new Scanner(System.in);
        int selecion;
        do{
            System.out.println("Selecciona una de las dos opciones: ");
            System.out.println("1-Gestionar preguntas (Altas/Bajas/Modificaciones)");
            System.out.println("2-Jugar");
            System.out.println("3-Salir");
            selecion = tc.nextInt();
            switch (selecion){
                case 1:
                    menu2();
                case 2:

                default:
                    System.out.println("El numero introducido no se corresponde con ninguna opcion");

            }
        } while(selecion != 3);

    }

    private static void menu2(){
        Scanner tc = new Scanner(System.in);
        int selecion;
        do {
            System.out.println("Selecciona una de estas 3 opciones: ");
            System.out.println("1- Dar de alta una pregunta");
            System.out.println("2- Dar de baja una pregunta");
            System.out.println("3- Modificar una pregunta");
            System.out.println("4-Salir");
            selecion = tc.nextInt();
            switch (selecion){
                case 1:
                    menu3();
                case 2:

                case 3:

                default:
                    System.out.println("El numero introducido no se corresponde con ninguna opcion");
            }
        }while (selecion !=4);

    }

    private static void menu3(){
        Scanner tc = new Scanner(System.in);
        int selecion;
        do {
            System.out.println("Deseas pasar una pregunta sola o un conjunto d-e ellas?");
            System.out.println("1-Dar de alta una sola");
            System.out.println("2-Dar de alta una serie de preguntas");
            System.out.println("3-Salir");
            selecion = tc.nextInt();
            switch (selecion){
                case 1:
                    if (PreguntaDAO.escribirPregunta(GestionPreguntas.altaPregunta())){
                        System.out.println("Pregunta añadida correctamente");
                    } else {
                        System.out.println("Fallo al introducir la pregunta");
                    }

                case 2:

                default:
                    System.out.println("El numero introducido no se corresponde con ninguna opcion");

            }

        }while (selecion != 3);


    }
}
