package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Trece extends JFrame {

    private JPopupMenu pmen;
    private JMenuItem menuRojo;
    private JMenuItem menuAzul;
    private JMenuItem menuVerde;

    public Trece(){
        super("Trece");
        inicializar();
        eventos();
    }

    private void inicializar(){
        pmen = new JPopupMenu();
        menuAzul = new JMenuItem("Azul");
        pmen.add(menuAzul);
        menuRojo = new JMenuItem("Rojo");
        pmen.add(menuRojo);
        menuVerde = new JMenuItem("Verde");
        pmen.add(menuVerde);
    }

    private void eventos(){
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()==3) {
                    pmen.show(Trece.this, e.getX(), e.getY());
                }
            }
        });

        menuRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.red);
            }
        });

        menuVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.green);
            }
        });

        menuAzul.addActionListener(new ActionListener() {
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
                Trece ventana = new Trece();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
