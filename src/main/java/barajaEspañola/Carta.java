package barajaEspañola;

public class Carta {

    private int numero;
    private String palo;


    public Carta() {
    }

    public Carta(int numero, String  palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return this.numero + " de " + this.palo + ".";
    }
}
