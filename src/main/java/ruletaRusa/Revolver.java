package ruletaRusa;

public class Revolver {

    private int posicionActual;
    private int posicionBala;
    private int sizeCargador;

    public Revolver() {
        this.posicionBala = (int)(Math.random()*6+1); //Esto nos da un valor entre 1 y 6.
        this.posicionActual = (int)(Math.random()*6+1);
        this.sizeCargador = 6;
    }

    public Revolver(int size){
        this.posicionBala = (int)(Math.random()*6+1); //Esto nos da un valor entre 1 y 6.
        this.posicionActual = (int)(Math.random()*6+1);
        this.sizeCargador = size;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public boolean disparar(){
        return this.posicionActual == this.posicionBala;
    }

    public void siguienteBala(){
        if (this.posicionActual != this.sizeCargador) {
            posicionActual++;
        } else posicionActual = 0;

    }

    @Override
    public String toString() {
        return "Estas en la posicion " + this.posicionActual + " y la bala se encuentra en la posicion: " +this.posicionBala;
    }

}
