package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;

public class Veinte extends JFrame {

    private JLabel unidades;
    private JLabel precio;
    private JLabel total;
    private JTextField primero;
    private JTextField segundo;
    private JLabel lbl;
    private JButton calcular;
    private JButton configuracion;

    public Veinte(){
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
                Veinte ventana = new Veinte();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
