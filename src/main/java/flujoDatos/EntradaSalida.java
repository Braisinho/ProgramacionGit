package flujoDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntradaSalida {
    public static void main(String[] args) {
        FileInputStream entrada = null;
        FileOutputStream saida = null;
        try {
            //Ruta por defecto
            File directory = new File("./");
            System.out.println(directory.getAbsolutePath());

            entrada = new FileInputStream("texto.txt");
            saida = new FileOutputStream("textoCopia.txt");
            int c;
            while ((c = entrada.read()) != -1) {
                saida.write(c);
                System.out.print((char) c);
            }
        } catch (IOException e) {

            System.out.println(System.getProperty("java.class.path"));
        } finally {
            if ( entrada != null ) {
                try {
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println("Error " + ex.getMessage());
                }
            }
            if ( saida != null ) {
                try {
                    saida.close();
                } catch (IOException ex) {
                    System.out.println("Error " + ex.getMessage());
                }
            }

        }
    }
}