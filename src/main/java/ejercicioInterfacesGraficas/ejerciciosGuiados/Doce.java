package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;

public class Doce extends JFrame {

    private JMenuBar barraMenu;
    private JToolBar tbr;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private Icon iconoBoton1;

    public Doce(){
        super("Doce");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        barraMenu = new JMenuBar();
        barraMenu.setBounds(0,0,500,30);
        add(barraMenu);

        tbr = new JToolBar();
        tbr.setBounds(0,30,500,30);
        add(tbr);

        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();

        iconoBoton1 = new ImageIcon("imagenes/abrir.png");
        boton1.setIcon(iconoBoton1);



        tbr.add(boton1);
        tbr.add(boton2);
        tbr.add(boton3);
        tbr.add(boton4);

    }

    private void eventos(){
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Activaste el botón uno");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Activaste el botón dos");
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Activaste el botón tres");
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Activaste el botón cuatro");
            }
        });
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
