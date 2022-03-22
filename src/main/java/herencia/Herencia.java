package herencia;


class A {

    A() {
        System.out.println("Estoy en el constructor A");
    }

    A(String mensaje) {
        System.out.println(mensaje);
    }

    A(int valorA) {
        System.out.println(valorA);
    }
}

class B extends A {

    public B() {
        System.out.println("Estoy en el constructor B");
    }

    public B(String mensaje) {
        System.out.println(mensaje);
    }

    public B(int valorB) {
        super(valorB);
        System.out.println(valorB);
    }
}

class C extends B {

    public C() {
        System.out.println("Estoy en el constructor C");
    }

    public C(String mensaje) {

        System.out.println(mensaje);
    }

    public C(int valorC) {
        super(valorC);
        System.out.println(valorC);
    }
}

public class Herencia {

    public static void main(String[] args) {

        C obj1 = new C();
        System.out.println("------------------");
        C obj2 = new C("DAM1");
        System.out.println("------------------");
        C obj3 = new C(1234);

    }
}
