package claseSinGenerica.claseConGenerica;

import claseSinGenerica.ClaseSinGenerica;

public class MainClaseGenerico {
    public static void main(String[] args) {
        //Creamos una instancia de ClaseGenerica para Integer
        System.out.println("Primera llamada");
        ClaseGenerica<Integer> intObj = new ClaseGenerica<>();
        intObj.classType(88);

        //Creamos una instancia de ClaseGenerica para String
        System.out.println("Segunda llamada");
        ClaseGenerica<String> strgObj = new ClaseGenerica<>();
        strgObj.classType("Paso una cadena");

        //Creamos una instancia de ClaseGenerica para double
        System.out.println("Primera llamada");
        ClaseGenerica<Double> doubleObj = new ClaseGenerica<>();
        doubleObj.classType(3.14);

    }
}
