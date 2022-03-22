package serVivo;


public class Vegetal extends SerVivo{


    public Vegetal(String nombreCientifico, String nombre, double altura) {
        super(nombreCientifico, nombre, altura);
    }

    @Override
    public String toString() {
        return this.getNombreCientifico() + " con un nombre comun de " + this.getNombre() + " con" +
                "  una altua de  " + this.getAltura();
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Vegetal) ) return false;
        if ( o == null ) return false;
        return Double.compare(((Vegetal) o).getAltura(), this.getAltura()) == 0
                && (((Vegetal) o).getNombre().equals(this.getNombre()))
                && (((Vegetal) o).getNombreCientifico().equals(this.getNombreCientifico()));

    }

}
