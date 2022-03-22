package potencia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.println("Introduce la base de la potencia");
        int base = tc.nextInt();
        System.out.println("Introduce el exponente de una potencia");
        int exponente = tc.nextInt();
        System.out.println(Main.potencia(base,exponente));
    }

    private static int potencia(int base, int exponente){

        return (exponente == 1) ? base : potencia(base,exponente-1) * base;
    }
}
