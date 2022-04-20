package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;

public class Doce extends JFrame {

    public Doce(){
        super("Doce");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);
    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Doce ventana = new Doce();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
