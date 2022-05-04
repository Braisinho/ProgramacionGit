package prubasInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz1 extends JFrame {

    private JButton cerrar;

    private Interfaz1(){
        super("Interfaz1");
        setSize(500,500);
        setVisible(true);

        setLayout(null);

        cerrar = new JButton("Abrir");
        cerrar.setBounds(10,10,100,30);
        add(cerrar);

        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Interfaz2.crearVentana2();
                setVisible(false);
            }
        });
    }

    public static void crearVentana1(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz1();
            }
        });
    }

    public static void cerrar(){
        System.exit(0);
    }
}
