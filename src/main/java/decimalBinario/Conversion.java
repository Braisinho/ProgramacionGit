package decimalBinario;

import java.util.Iterator;
import java.util.Stack;

public class Conversion {

    public static void  DecimalABinario(int numero){

        Stack<Integer> decimalABInario = new Stack<>();

        int dividendo = numero;
        int divisor = 2;
        int resto = 0;
        String salida ="";



        while(dividendo>=1){
            resto = dividendo % divisor;
            dividendo = (dividendo/divisor);
            decimalABInario.push(resto);
        }
        System.out.println(decimalABInario);

        for (int i = decimalABInario.size()-1; i>=0; i--){
            salida += decimalABInario.get(i);
        }

        System.out.println(salida);









    }
}
