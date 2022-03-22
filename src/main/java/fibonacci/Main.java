package fibonacci;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.println("Introduce la posicion de la sucesión fibonacci que desee conocer:");

        int posicion = tc.nextInt();
        System.out.println(Main.fibonacci(posicion));
    }

    private static int fibonacci (int pos) {

        return ((pos <=1) ? pos : fibonacci(pos-1) + fibonacci(pos-2));

    }

}


