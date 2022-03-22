package serVivo;


public class Animal  extends SerVivo{

    private double peso;


    public Animal(String nombreC, String nombre, double altura) {
        super(nombreC, nombre, altura);
    }

    public Animal(String nombreCientifico, String nombre, double peso, double altura) {
        super(nombreCientifico, nombre,altura);
        this.peso = peso;

    }

    @Override
    public String toString() {
        return this.getNombreCientifico() + " con un nombre comun de " + this.getNombre() + " con" +
                " un peso y una altua de  " + this.peso + " " + this.getAltura();
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Animal) ) return false;
        if ( o == null ) return false;
        return (Double.compare(((Animal) o).peso, this.peso) == 0
                && Double.compare(((Animal) o).getAltura(), this.getAltura()) == 0
                && (((Animal) o).getNombre().equals(this.getNombre()))
                && (((Animal) o).getNombreCientifico().equals(this.getNombreCientifico())));

    }


}












































