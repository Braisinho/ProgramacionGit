package trivial_1_1.controlador;

import java.util.ArrayList;
import trivial_1_1.modelo.Pregunta;
import trivial_1_1.modelo.PreguntaDAO;
import trivial_1_1.vista.*;



public class Inicio {

    public static void main(String args[]) {

        boolean seguir = true;

        while (seguir) {
            int opcion = Menu.menuOpcionesInicio();

            switch (opcion) {
                case Menu.INICIO_JUGAR:
                    Trivial.jugar();
                    break;
                case Menu.INICIO_PREGUNTAS:
                    gestionarPreguntas();
                    break;
                case Menu.INICIO_SALIR:
                    seguir = false;
                    break;
                default:
                    MostrarError.mensajeError("Indica una opcion correcta");
                    break;
            }
        }
        System.out.println("FIN DEL PROGRAMA");
    }


    
    private static void gestionarPreguntas(){
        int opcion = Menu.menuGestionPreguntas();
        switch (opcion) {
            case Menu.GESTION_ALTA_PREGUNTA:
                Pregunta nueva = GestionPreguntas.altaPregunta();
                PreguntaDAO.escribirPreguntaFichero(nueva, "preguntas.txt");
                break;
            case Menu.GESTION_ALTA_PREGUNTAS:
               
                ArrayList<Pregunta> listaPreguntas = GestionPreguntas.altaPreguntas();
                PreguntaDAO.escribirPreguntasFichero(listaPreguntas,"preguntas.txt");
                break;
        }
                   
    }
}
