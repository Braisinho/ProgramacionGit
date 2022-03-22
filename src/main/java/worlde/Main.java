package worlde;

import java.util.Scanner;

public class Main {
    final static int INTENTOS_MAXIMOS = 6;
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String word = "LIBRO";
        String wordIntento;
        boolean acierto = false;
        int intentos = 0;
        System.out.println("Comienza el juego");
        System.out.println("1 = Posicion acertada");
        System.out.println("? = letra acertada pero posicion incorrecta");
        System.out.println("_ = letra fallada");

        while (!acierto && intentos < INTENTOS_MAXIMOS) {
            String wordSalida = "";
            intentos++;

            System.out.println("Introduce una palabra de 5 letras");
            wordIntento = tc.next().toUpperCase();
            if ( word.equalsIgnoreCase(wordIntento) ) {
                System.out.println("Bien hecho, has acertado correctamente en un total de " + intentos + " intentos.");
                acierto = true;
            } else {
                boolean encontrada = false;
                for (int i = 0; i < wordIntento.length(); i++) {
                    encontrada = false;
                    for (int j = 0; j < word.length(); j++) {
                        if ( word.charAt(j) == wordIntento.charAt(i) ) {
                            if ( i == j ) {
                                wordSalida += 1;
                            } else {
                                wordSalida += "?";
                            }
                            encontrada = true;
                        }
                    }
                    if ( !encontrada ) {
                        wordSalida += "_";
                    }

                }
                System.out.println(wordIntento);
                System.out.println(wordSalida);
            }

        }
        if ( intentos > INTENTOS_MAXIMOS-1 ) System.out.println("Has sobrepasado el numero de intentos.");
    }
}
