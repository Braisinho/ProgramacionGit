package hora;

public class Hora {

    private int hora;
    private int minuto;


    public Hora() {
    }

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }


    public void inc() {
        this.minuto += 1;
        if ( this.minuto > 59 ) {
            this.hora += 1;
            this.minuto = 0;
        }
        if ( this.hora > 23 ) {
            this.hora = 0;
        }
    }

    public boolean setMinuto(int minutos) {
        if ( minutos >= 0 & minutos < 60 ) {
            this.minuto = minutos;
            return true;
        }
        return false;
    }

    public boolean setHora(int hora) {
        if ( hora >= 0 & hora < 24 ) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "hora=" + hora +
                ", minuto=" + minuto;
    }


}

















