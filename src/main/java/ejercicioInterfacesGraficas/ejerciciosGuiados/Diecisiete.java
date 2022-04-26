package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Diecisiete extends JFrame {

    private JMenuBar menuBarra;
    private JMenu calcular;
    private JMenuItem sumar;
    private JMenuItem restar;
    private JMenuItem borrar;
    private JLabel numero1;
    private JLabel numero2;
    private JTextField cuadro1;
    private JTextField cuadro2;
    private JLabel etiResultado;
    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonBorrar;

    public Diecisiete(){
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        sumar = new JMenuItem("Sumar");
        restar = new JMenuItem("Restar");
        borrar = new JMenuItem("Borrar");

        calcular = new JMenu("Calcular");
        calcular.add(sumar);
        calcular.add(restar);
        calcular.add(borrar);

        menuBarra = new JMenuBar();
        menuBarra.add(calcular);
        setJMenuBar(menuBarra);

        numero1 = new JLabel("Numero 1:");
        numero1.setBounds(40,80,60,30);
        add(numero1);

        numero2 = new JLabel("Numero 2:");
        numero2.setBounds(40,120,60,30);
        add(numero2);

        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));
        etiResultado.setBounds(40,200,250,30);
        add(etiResultado);

        cuadro1 = new JTextField();
        cuadro1.setBounds(110,90,150,20);
        add(cuadro1);

        cuadro2 = new JTextField();
        cuadro2.setBounds(110,130,150,20);
        add(cuadro2);

        botonSumar = new JButton("Sumar");
        botonSumar.setBounds(40,250,250,30);
        add(botonSumar);

        botonRestar = new JButton("Restar");
        botonRestar.setBounds(40,290,250,30);
        add(botonRestar);

        botonBorrar = new JButton("Borrar");
        botonBorrar.setBounds(40,330,250,30);
        add(botonBorrar);

    }

    private void eventos(){
        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiResultado.setText(sumar() + "");
            }
        });

        botonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiResultado.setText(restar() + "");
            }
        });

        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borar();
            }
        });

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiResultado.setText(sumar() + "");
            }
        });

        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiResultado.setText(restar() + "");
            }
        });

        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borar();
            }
        });
    }

    private int sumar(){
        return Integer.parseInt(cuadro1.getText()) + Integer.parseInt(cuadro2.getText());
    }

    private int restar(){
        return Integer.parseInt(cuadro1.getText()) - Integer.parseInt(cuadro2.getText());
    }

    private void borar(){
        cuadro1.setText("");
        cuadro2.setText("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Diecisiete ventana = new Diecisiete();
                ventana.setSize(350,500);
                ventana.setVisible(true);
            }
        });
    }
}
