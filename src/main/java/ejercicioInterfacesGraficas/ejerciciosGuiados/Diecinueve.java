package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Diecinueve extends JFrame {

    private BorderLayout blt;
    private JPanel panelTitulo;
    private JPanel panelCentral;
    private JPanel panelEstado;
    private JPanel panelBotonera;
    private JPanel panelVerificacion;

    public Diecinueve (){

    }

    private void inicializar(){
        panelTitulo = new JPanel();
        add(panelTitulo, BorderLayout.PAGE_START);

        panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        panelEstado = new JPanel();
        add(panelEstado, BorderLayout.PAGE_END);

        panelBotonera = new JPanel();

        add(panelBotonera, BorderLayout.LINE_START);

        panelVerificacion = new JPanel();
        add(panelVerificacion, BorderLayout.LINE_END);

    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Diecinueve ventana = new Diecinueve();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
