package trivial_1_1.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PreguntaDAO {

    public static boolean escribirPreguntaFichero(Pregunta nueva, String nombreFichero) {
        BufferedWriter buffer = null;
        String linea;

        try {
            FileWriter file = new FileWriter(nombreFichero, true);

            buffer = new BufferedWriter(file);

            linea = nueva.getEnunciado() + "#" + nueva.getRespuesta1() + "#" + nueva.getRespuesta2() + "#" + nueva.getRespuesta3() + "#" + nueva.getCorrecta();
            buffer.write(linea);
            buffer.newLine();
            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return false;

    }

    public static boolean escribirPreguntasFichero(ArrayList<Pregunta> listaPreguntas, String nombreFichero) {
        BufferedWriter buffer = null;

        try {
            FileWriter file = new FileWriter(nombreFichero, true);

            buffer = new BufferedWriter(file);

            for (Pregunta e : listaPreguntas){
                if ( e != null ){
                    buffer.write(e.getEnunciado() + "#" + e.getRespuesta1() + "#" + e.getRespuesta2() + "#" + e.getRespuesta3() + "#" + e.getCorrecta());
                    buffer.newLine();
                }
            }

            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return false;
    }

    public static HashMap<Integer, Pregunta> leerPreguntasFichero(String nombreFichero) {
        HashMap<Integer, Pregunta> preguntas = new HashMap<Integer, Pregunta>();
        BufferedReader buffer;
        String linea;
        int indice = 0;

        try {
            FileReader file = new FileReader("./" + nombreFichero);
            buffer = new BufferedReader(file);

            while ((linea = buffer.readLine()) != null) {
                indice++;
                String cadenaCortada[] = linea.split("#", 0);
                if (cadenaCortada.length == 5) {
                    preguntas.put(indice,new Pregunta(cadenaCortada[0],cadenaCortada[1],cadenaCortada[2],cadenaCortada[3],Integer.parseInt(cadenaCortada[4])));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return preguntas;
    }

}
