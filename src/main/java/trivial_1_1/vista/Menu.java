package trivial_1_1.vista;

import java.util.Scanner;

public class Menu {
    
        public static final int OPCION_DEFECTO = -1;
        
        public static final int INICIO_JUGAR = 1;
        public static final int INICIO_PREGUNTAS = 2;
        public static final int INICIO_SALIR = 3;
        
        public static final int PREGUNTAS_SIGUIENTE = 1;
        public static final int PREGUNTAS_PUNTUACION = 2;
        public static final int PREGUNTAS_SALIR = 3;
        
        public static final int GESTION_ALTA_PREGUNTA = 1;
        public static final int GESTION_ALTA_PREGUNTAS = 2;
        public static final int GESTION_BAJA_PREGUNTA = 3;
        public static final int GESTION_MODIFICACION_PREGUNTA = 4;
        public static final int GESTION_SALIR = 5;
        
	public static int menuOpcionesInicio() {
		Scanner sc = new Scanner(System.in);
		int opcion = OPCION_DEFECTO;
		
		System.out.println("Indica una opcion:");
		System.out.println("1- Jugar");
		System.out.println("2- Gestionar preguntas");
		System.out.println("3- Salir");
                System.out.println("");
		opcion = sc.nextInt();
		
		return opcion;
	}
        
	public static int menuOpcionesJuego() {
		Scanner sc = new Scanner(System.in);
		int opcion = OPCION_DEFECTO;
		
		System.out.println("Indica una opción:");
		System.out.println("1- Pregunta");
		System.out.println("2- Mostrar puntuación");
		System.out.println("3- Salir del juego y mostrar puntos ");
                System.out.println("");
		opcion = sc.nextInt();
		
		return opcion;
	}
	
        public static int menuGestionPreguntas() {
		Scanner sc = new Scanner(System.in);
		int opcion = OPCION_DEFECTO;
		
		System.out.println("Indica una opción:");
		System.out.println("1- Crear una pregunta");
		System.out.println("2- Crear lista de preguntas");
		System.out.println("3- Eliminar pregunta");
                System.out.println("4- Modificar pregunta");
                System.out.println("5- Salir");
                System.out.println("");
		opcion = sc.nextInt();
		
		return opcion;
	}

   
}
