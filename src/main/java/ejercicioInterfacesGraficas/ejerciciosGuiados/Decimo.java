package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;

public class Decimo extends JFrame {

    public Decimo(){
        super("Decimo");
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Decimo ventana = new Decimo();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
