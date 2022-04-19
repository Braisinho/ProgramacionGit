package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuarto extends JFrame {

    private JComboBox<String> cbx;
    private JTextField salida;

    public Cuarto(){
        super("Cuarto");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        cbx = new JComboBox<>();
        cbx.setBounds(20,60,150,40);
        add(cbx);
        cbx.addItem("Rojo");
        cbx.addItem("Verde");
        cbx.addItem("Azul");

        salida = new JTextField();
        salida.setBounds(20,360,300,20);
        add(salida);

    }

    private void eventos(){
        cbx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText(mesagge());
            }
        });
    }

    private String mesagge(){
        return "El color elegido es : " +cbx.getSelectedItem().toString();

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Cuarto ventana = new Cuarto();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
