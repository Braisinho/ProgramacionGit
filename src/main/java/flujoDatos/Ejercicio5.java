package flujoDatos;

import java.util.Date;

public class Ejercicio5 {
    public static void main(String[] args) {

        int a = -7;
        float b = 123.12345678f;
        String c = "Hola";
        Date fecha = new Date();

        //La variable entera se mostrará por un lado con signo, y a continuación con paréntesis.

        System.out.printf("%+d",a);
        System.out.printf("%(d",a);
        System.out.println();

        // La variable float se mostrará en notación real con punto fijo, y también en notación
        //científica.

        System.out.printf("%.0f", b);
        System.out.println();
        System.out.printf("%e", b);
        System.out.println();

        //La variable float de manera que se muestren 10 dígitos con 3 para la parte decimal, y en
        //caso de que el número de dígitos sea menor se rellenarán los espacios con 0, también se
        //mostrará el mesmo formato, pero con alineación a la izquierda.

        System.out.printf("%010.3f",b);
        System.out.println();

        //Se mostrará el valor de la variable float y el de la variable entera y a continuación el
        //resultado de su división, se mostrarán a continuación los dos valores y el resultado de su
        //suma.

        System.out.printf("Flotante %f Entero %d Division %f",b,a, b/a);
        System.out.println();

        //La variable de tipo cadena en mayúscula, ocupando 15 espacios, y la cadena con 15
        //espacios, pero alineación a la izquierda

        System.out.printf("%-15S.",c);

        // La variable de tipo data de manera que se vea un texto como el siguiente: “Son las 13
        //horas 50 minutos 55 segundos (formato PM) del 21 de octubre del año 2021”. El PM será
        //parte del formato. Si la hora fuera las 01 mostraría automáticamente AM.

    }
}
