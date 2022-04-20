package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Onceavo extends JFrame {

    private JMenuBar mbr;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenuItem guardar;
    private JMenuItem abrir;
    private JMenuItem salir;
    private JMenu colores;
    private JMenuItem rojo;
    private JMenuItem verde;
    private JMenuItem azul;


    public Onceavo(){
        super("Onceavo");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        mbr = new JMenuBar();
        setJMenuBar(mbr);

        menu1 = new JMenu("Archivo");
        mbr.add(menu1);

        menu2 = new JMenu("Edicion");
        mbr.add(menu2);

        menu3 = new JMenu("Insertar");
        mbr.add(menu3);

        abrir = new JMenuItem("Abrir");
        menu1.add(abrir);

        guardar = new JMenuItem("Guardar");
        menu1.add(guardar);

        salir = new JMenuItem("Salir");
        menu1.add(salir);

        colores = new JMenu("Colores");
        menu2.add(colores);

        rojo = new JMenuItem("Rojo");
        colores.add(rojo);

        verde = new JMenuItem("Verde");
        colores.add(verde);

        azul = new JMenuItem("Azul");
        colores.add(azul);

    }

    private void eventos(){

        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.red);
            }
        });

        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.green);
            }
        });

        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.blue);
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Onceavo ventana = new Onceavo();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
