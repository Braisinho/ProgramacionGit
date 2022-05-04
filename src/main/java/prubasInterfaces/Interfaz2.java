package prubasInterfaces;

import javax.swing.*;

public class Interfaz2 extends JFrame {

    private Interfaz2(){
        super("Interfaz2");
        setSize(500,500);
        setVisible(true);
    }

    public static void crearVentana2(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz2();
            }
        });
    }
}
