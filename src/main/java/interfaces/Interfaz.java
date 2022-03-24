package interfaces;

import javax.swing.*;

public class Interfaz extends JFrame{


    private JButton button1;

    public Interfaz(){
        super("Hola");
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

}
