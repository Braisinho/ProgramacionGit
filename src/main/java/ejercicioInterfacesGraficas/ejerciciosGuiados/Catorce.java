package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;

public class Catorce extends JFrame {

    public Catorce(){
        super("Catorce");
        inicializar();
        eventos();
    }

    private void inicializar(){

    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Catorce ventana = new Catorce();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
