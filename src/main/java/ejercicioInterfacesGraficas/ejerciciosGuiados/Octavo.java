package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Octavo extends JFrame {

    private JSlider deslizador;
    private JLabel vacia;

    public Octavo(){
        super("Octavo");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        deslizador = new JSlider();
        deslizador.setBounds(10,20,400,100);
        deslizador.setMinimum(100);
        deslizador.setMaximum(500);
        deslizador.setMajorTickSpacing(50);
        deslizador.setPaintLabels(true);
        add(deslizador);

        vacia = new JLabel();
        vacia.setBounds(20,390,150,50);
        vacia.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(vacia);

    }

    private void eventos(){
        deslizador.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                vacia.setText("El valor es: " + deslizador.getValue());
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Octavo ventana = new Octavo();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
