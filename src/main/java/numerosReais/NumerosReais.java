package numerosReais;

import java.io.*;


public class NumerosReais {
    public static void main(String[] args) {
        File fl = new File("NumerosReais.txt");
        System.out.println(media(fl));

    }

    private static String[] leerFicheiro( File a) {
        FileReader fr = null;
        BufferedReader bf = null;
        String numeros = null;
        String[] archivo = null;
        try {

            fr = new FileReader(a);
            bf = new BufferedReader(fr);
            numeros = bf.readLine();
            System.out.println(numeros);
            archivo = numeros.split(" ");

        }catch (IOException error){

            System.out.println(error.getMessage());

        }finally {

            try {
                if ( bf != null ){
                    bf.close();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return archivo;
    }


    public static float media(File a)   {
        String[] numeros = null;
        numeros = leerFicheiro(a);
        float suma = 0;
        for (String numero : numeros) {
            suma += Float.parseFloat(numero);
        }
        return (suma/numeros.length);

    }
}
