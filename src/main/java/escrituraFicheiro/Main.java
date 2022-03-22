package escrituraFicheiro;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {



        Pelirrojo elias = new Pelirrojo(0, "Elias", 1.85);
        Pelirrojo Manu = new Pelirrojo(0, "Manu", 1.85);
        File ficheiro = new File("Pelirrojo.ser");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro));
        serializar(elias,ficheiro);




        deserializar(ficheiro);

    }


    public static void serializar(Pelirrojo p,File a){
            ObjectOutputStream oos =  null;
            try {
                oos = new ObjectOutputStream(new FileOutputStream(a,true));
                oos.writeObject(p);

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

    public static void deserializar(File a){
        ObjectInputStream ois = null;


        try {
            ois = new ObjectInputStream(new FileInputStream(a));
            System.out.println(ois.readObject().toString());

        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if ( ois != null ){
                    ois.close();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

}
