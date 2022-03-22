package comparable;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Principal {
    
    private static ArrayList<Persona> listaPersonas;

    public static void main(String[] args) {
        int opcion;

        listaPersonas = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nLISTA DE PERSONAS:");
            System.out.println("[1] Registrar persona  ");
            System.out.println("[2] Buscar persona por DNI");
            System.out.println("[3] Eliminar persona");
            System.out.println("[4] Ordenar por apellidos");
            System.out.println("[5] Mostrar personas");
            System.out.println("[6] Salir\n ");
            System.out.print("Introduzca opción (1-6): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    ordenarPorApellido();
                    break;
                case 5:
                    mostrarPersonas();
                    break;
            }
        } while (opcion != 6);
    }

    public static void registrarPersona() {
        String apellidos, nombre;
        int dni, edad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        dni = entrada.nextInt();   entrada.nextLine();
        System.out.print("Apellidos: ");
        apellidos = entrada.nextLine();
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Edad: ");
        edad = entrada.nextInt();;
        Persona persona = new Persona(dni, edad, apellidos, nombre);
        listaPersonas.add(persona);
    }

    // Crear un objeto persona
    // Buscar la posición (índice) de la persona que estamos buscando
    // Si la persona se encuentra, mostrarla
    // Si no se encuentra, indicar que no se encuentra
    public static int buscarPersona() {
        return 1;
    }

    // Eliminar persona preguntando el dni
    public static void eliminarPersona() {
    }

    //Mostrar todas las personas de la lista
    public static void mostrarPersonas() {
    }

    
    public static void ordenarPorApellido() {

        listaPersonas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getApellido().compareTo(o2.getApellido());
            }
        });
    }

}
