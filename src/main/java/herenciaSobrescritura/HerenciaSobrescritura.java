package herenciaSobrescritura;


class A{
    String campo1 = "rojo";
    String campo2 = "negro";
}

class B extends A{
    int campo1 = 1;
}

class C extends B{
    char campo1 = 'X';

    void verCampos(){
        System.out.println("Acceso desde clase C");
        System.out.println("Campo 2 de C = " +campo2);
        System.out.println("Campo 1 de C = " +this.campo1);
        System.out.println("Campo 1 de B = " +super.campo1);
        System.out.println("Campo 1 de B = " +((A)this).campo1);
        System.out.println(((A)this).campo1);
        //El this hace referencia a un Objeto de tipo C
    }
}

public class HerenciaSobrescritura {

    public static void main(String[] args) {

        C objeto1 = new C();

        System.out.println("Acceso desde Main");
        System.out.println("Campo 2 de C = " + objeto1.campo2);
        System.out.println("Campo 1 de C = " + objeto1.campo1);
        System.out.println("Campo 1 de B = " + ((B)objeto1).campo1);
        System.out.println("Campo 1 de A = " + ((A)objeto1).campo1);
        System.out.println();
        objeto1.verCampos();

    }

}