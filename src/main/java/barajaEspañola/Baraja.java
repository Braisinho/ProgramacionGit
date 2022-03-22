package barajaEspañola;


import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

    private Carta[] baraja;
    private Carta[] cartasDadas;
    private final int SIZE = 40;
    private int contadorCartas = 0;
    private int contadorCartasRestantes = SIZE;

    public Baraja() {
        this.baraja = new Carta[SIZE];
        crearBaraja();
        this.cartasDadas = new Carta[SIZE];
    }

    private void crearBaraja() {
        int i = 0;
        for (int j = 0; i < 10; i++, j++) {
            if (j < 7){
                baraja[i] = new Carta(j+1, "Oros");
            } else{
                baraja[i] = new Carta(j+3, "Oros");
            }
        }
        for (int k = 0; i< 20; i++, k++){
            if (k < 7){
                baraja[i] = new Carta(k+1, "Espadas");
            } else{
                baraja[i] = new Carta(k+3, "Espadas");
            }
        }
        for (int l = 0; i< 30; i++, l++){
            if (l < 7){
                baraja[i] = new Carta(l+1, "Copas");
            } else{
                baraja[i] = new Carta(l+3, "Copas");
            }
        }
        for (int m = 0; i< 40; i++, m++){
            if (m < 7){
                baraja[i] = new Carta(m+1, "Bastos");
            } else{
                baraja[i] = new Carta(m+3, "Bastos");
            }
        }
    }

    public void barajar(){
        int posAleatoria = 0;
        Carta aux;
        for (int i = 0; i<baraja.length; i++){

            posAleatoria = ThreadLocalRandom.current().nextInt(0, SIZE);
            aux = baraja[i];
            baraja[i] = baraja[posAleatoria];
            baraja[posAleatoria] = aux;
        }
    }

    public void mostrarBaraja(){
        System.out.println("Las cartas que quedan en la baraja son: ");
        for (Carta carta : baraja) {
            if ( carta != null ){
                System.out.println(carta.toString());
            }
        }
    }

    public void siguienteCarta(){

        try {
            System.out.println(baraja[this.contadorCartas].toString());
            this.contadorCartas++;
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("No quedan cartas");
            this.contadorCartas = 0;
        }

    }

    public int cartasDisponibles(){
        for (Carta carta : baraja) {
            if ( carta == null ) {
                contadorCartasRestantes--;
            }
        }
        return contadorCartasRestantes;
    }

    public void darCartas(int numeroCartas){
        if ( numeroCartas > contadorCartasRestantes ){
            System.out.println("El numero de cartas solicitadas es mayor al numero de cartas que tenemos en la baraja");
        } else{
            for (int i = 0; i<numeroCartas; i++){
                if ( baraja[i] != null ){
                    System.out.println(baraja[i].toString());
                    cartasDadas[i] = baraja[i];
                    baraja[i] = null;
                }
            }
        }
    }

    public void cartasMonton(){
        System.out.println("Las cartas que se han sacado de la baraja son: ");
        for (Carta carta : cartasDadas) {
            if ( carta != null ){
                System.out.println(carta.toString());
            }
        }
    }

}
