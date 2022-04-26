package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dieciseis extends JFrame {

    private int coches;

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JLabel lbl1;
    private JLabel lbl2;

    public Dieciseis(){
        super("Parking");
        inicializar();
        eventos();
        coches = 0;
    }

    private void inicializar(){
        setLayout(null);

        boton1 = new JButton("Entro un coche");
        boton1.setBounds(10,40,150,25);
        add(boton1);

        boton2 = new JButton("Salio un coche");
        boton2.setBounds(10,100,150,25);
        add(boton2);

        boton3 = new JButton("Reiniciar");
        boton3.setBounds(10,160,150,25);
        add(boton3);

        lbl1 = new JLabel("Coches en el parking");
        lbl1.setBounds(10,300,150,25);
        add(lbl1);

        lbl2 = new JLabel();
        lbl2.setBorder(BorderFactory.createLineBorder(Color.blue));
        lbl2.setBounds(180,300,150,25);
        add(lbl2);
    }

    private void eventos(){
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coches+=1;
                lbl2.setText(coches + "");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(coches > 0){
                    coches-=1;
                    lbl2.setText(coches + "");
                }
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coches = 0;
                lbl2.setText(coches + "");
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dieciseis ventana = new Dieciseis();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
