package imprimir;

public class Main {
    public static void main(String[] args) {

        System.out.println(imprimir(5));
    }

    private static String imprimir(int a){

        return (a == 1) ? "1" : (imprimir(a-1) + " " + a);
    }
}