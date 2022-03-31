package ejercicioInterfacesGraficas.ejercicio1;


import javax.swing.*;

public class Saludo extends JFrame {


    private JTextField textField1;


    public Saludo(){
        super("Ejercicio 1");
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Saludo().setVisible(true);
            }
        });
    }



}
