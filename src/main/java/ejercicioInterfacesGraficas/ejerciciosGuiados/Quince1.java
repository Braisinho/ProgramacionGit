package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;

public class Quince1 extends JFrame {

    private JScrollPane spn;
    private JLabel lbl;

    public Quince1(){
        super("Quince");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        spn = new JScrollPane();
        spn.setBounds(50,50,400,400);
        add(spn);

        lbl = new JLabel();
        lbl.setBorder(BorderFactory.createLineBorder(Color.blue));
        lbl.setBounds(0,0,1000,1000);
        spn.add(lbl);
    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Quince1 ventana = new Quince1();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
