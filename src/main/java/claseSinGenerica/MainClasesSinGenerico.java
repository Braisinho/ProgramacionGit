package claseSinGenerica;

public class MainClasesSinGenerico {

    public static void main(String[] args) {
        //Creamos una instancia de ClaseGenerica para Integer
        System.out.println("Primera llamada");
        ClaseSinGenerica intObj = new ClaseSinGenerica();
        intObj.classTypeInterger(88);
        System.out.println("Segunda llamada");
        //Creamos una intancia de ClaseGenerica para String
        ClaseSinGenerica strObj = new ClaseSinGenerica();
        strObj.classTypeString("Paso una cadena");
        System.out.println("Tercera llamada");
        //Creamos una instancia de ClaseGenerica para Double
        ClaseSinGenerica doubleObj = new ClaseSinGenerica();
        doubleObj.classTypeDouuble(3.141617);
    }
}
