package trivial.modelo;

import java.io.*;
import java.util.ArrayList;

public class PreguntaDAO {

    public static boolean escribirPregunta(Pregunta p){
        BufferedWriter buffer = null;
        FileWriter file = null;

        String linea;
        boolean acertado = false;

        try{
            file = new FileWriter("preguntas.txt",true);
            buffer = new BufferedWriter(file);
            buffer.newLine();
            linea = p.getEnunciado() + " # " + p.getRespuesta1() + " # " + p.getRespuesta2() + " # " + p.getRespuesta3() + " # " + p.getRespuesta1();
            buffer.write(linea);
            buffer.flush();
            acertado = true;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if ( file != null ){
                    file.close();
                }
                if ( buffer !=null ){
                    buffer.close();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        return acertado;
    }



    public static boolean escribirPreguntas(ArrayList<Pregunta> p, File f ){
        return false;
    }
}
