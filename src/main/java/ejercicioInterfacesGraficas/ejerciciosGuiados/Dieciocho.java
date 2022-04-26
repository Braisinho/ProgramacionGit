package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;

public class Dieciocho extends JFrame {

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;

    public Dieciocho (){
        inicializar();
        eventos();
    }

    private void inicializar(){
        boton1 = new JButton("Boton 1");
        add(boton1, BorderLayout.CENTER);

        boton2 = new JButton("Boton 2");
        add(boton2, BorderLayout.PAGE_START);

        boton3 = new JButton("Boton 3");
        add(boton3, BorderLayout.LINE_START);

        boton4 = new JButton("Boton 4");
        add(boton4, BorderLayout.LINE_END);

        boton5 = new JButton("Boton 5");
        add(boton5, BorderLayout.PAGE_END);
    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dieciocho ventana = new Dieciocho();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
