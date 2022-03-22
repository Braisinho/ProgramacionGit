package ruletaRusa;

public class Jugador {

    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id, String nombre, boolean vivo) {
        this.id = id;
        this.nombre = nombre + id;
        this.vivo = vivo;
    }

    public void disparar(Revolver r){
        if ( r.disparar() ) {
            this.vivo = false;
            System.out.println(this.nombre + " esta muerto");
        } else{
            this.vivo = true;
            System.out.println(this.nombre + " no murio");
        }
    }
}
