
package productorcomsumidor;


public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Productor(q);
        new Consumidor(q);
        System.out.println("Control+C para parar");
    }
}
