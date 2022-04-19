package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Noveno extends JFrame {

    private JSpinner spn;
    private JLabel vacia;


    public Noveno(){
        super("Noveno");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        vacia = new JLabel();
        vacia.setBounds(20,390,150,50);
        vacia.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(vacia);

        spn = new JSpinner();
        spn.setBounds(20,60,150,50);
        add(spn);
    }

    private void eventos(){
        spn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                vacia.setText("El valor es: " +spn.getValue());
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Noveno ventana = new Noveno();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
