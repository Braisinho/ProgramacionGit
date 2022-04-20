package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Decimo extends JFrame {

    private JScrollBar barra;
    private JLabel vacia;

    public Decimo(){
        super("Decimo");
        iniciaizacion();
        enventos();
    }

    private void iniciaizacion(){
        setLayout(null);

        vacia = new JLabel();
        vacia.setBounds(20,390,150,50);
        vacia.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(vacia);

        barra = new JScrollBar();
        barra.setBounds(20,40,400,20);
        barra.setMaximum(150);
        barra.setMinimum(0);
        barra.setOrientation(0);
        add(barra);

    }

    private void enventos(){

        barra.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                vacia.setText(barra.getValue() + "");
            }
        });
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
