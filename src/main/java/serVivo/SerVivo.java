package serVivo;

public class SerVivo {

    private String nombreCientifico;
    private String nombre;
    private double altura;

    public SerVivo() {
    }

    public SerVivo(String nombreCientifico, String nombre, double altura){
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return  altura;
    }

}



















