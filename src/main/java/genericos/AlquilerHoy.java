package genericos;
import java.lang.*;

public class AlquilerHoy {

    private long horaRecogida;
    private long horaEntrega;
    private int kilometrosIniciales;

    public AlquilerHoy(long horaRecogida, long horaEntrega, int kilometrosIniciales) {
        this.horaRecogida = horaRecogida;
        this.horaEntrega = horaEntrega;
        this.kilometrosIniciales = kilometrosIniciales;
    }
}
