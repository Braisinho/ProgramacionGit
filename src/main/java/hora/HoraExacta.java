package hora;




public class HoraExacta extends Hora {

    private int segundos;


    public HoraExacta(){
    }

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundo(int segundos) {
        if ( segundos >= 0 & segundos < 60 ){
            this.segundos = segundos;
            return true;
        } return false;
    }

    @Override
    public void inc() {
        this.segundos += 1;
        if (this.segundos > 59) {
            super.inc();
            this.segundos = 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof HoraExacta) {
            if (this.getSegundos() == ((HoraExacta) o).segundos) {
                if (this.getMinuto() == ((HoraExacta) o).getMinuto()) {
                    return (this.getHora() == ((HoraExacta) o).getHora());
                }
                return false;
            }
            return false;
        }
        return false;
    }
}


























