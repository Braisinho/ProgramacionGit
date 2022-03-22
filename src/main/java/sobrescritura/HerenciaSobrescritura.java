package sobrescritura;


class A {

    public void A() {
        System.out.println("Metodo A() en A");
    }

    public void sobrescrito1() {
        System.out.println("Metodo sobrescrito1() en A");
    }

    public void sobrescrito2() {
        System.out.println("Metodo sobrescrito2() en A");
    }

}

class B extends A {

    public void B() {
        System.out.println("Metodo B() en B");
    }

    @Override
    public void sobrescrito1() {
        System.out.println("Metodo sobrescrito1() en B");
    }

    @Override
    public void sobrescrito2() {
        super.sobrescrito2();
    }

}

class C extends B {

    public void C() {
        System.out.println("Metodo C() en C");
    }

    @Override
    public void sobrescrito1() {
        System.out.println("Metodo sobrescrito1() en C");
    }

    @Override
    public void sobrescrito2() {
        super.sobrescrito2();
    }

}

public class HerenciaSobrescritura {

    public static void main(String[] args) {

        C obj = new C();
        obj.A();
        obj.B();
        obj.C();
        System.out.println("----------------------------------------------------");
        obj.sobrescrito1();
        ((B)obj).sobrescrito1(); //Cast no funciona.
        ((A)obj).sobrescrito1(); //Cast no funciona.
        System.out.println("----------------------------------------------------");
        obj.sobrescrito2();


    }
}
