package deserializarArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Persona> lista = new LinkedList<>();

        Persona a = new Persona("Alvaro", 20);
        Persona b = new Persona("Juan", 30);

        lista.add(a);
        lista.add(b);

        File archivo = new File("lista.ser");

        serializar(lista,archivo);
        System.out.println(deserializar(archivo));
    }

    public static void serializar(LinkedList<Persona> lista, File a){
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(a));
            oos.writeObject(lista);

        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if ( oos != null ){
                    oos.close();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static LinkedList<Persona> deserializar(File a){
        ObjectInputStream ois = null;
        LinkedList<Persona> listaSalida = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(a));
            listaSalida =(LinkedList<Persona>) ois.readObject();

        }  catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (ois !=null){
                    ois.close();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listaSalida;
    }
}


