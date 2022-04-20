package ejercicioInterfacesGraficas.ejerciciosGuiados;

import ejercicioInterfacesGraficas.Ejercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primero extends JFrame {

    private JCheckBox cbxPerro;
    private JCheckBox cbxGato;
    private JCheckBox cbxRaton;
    private JTextField salida;
    private JButton aceptar;

    public Primero(){
        super("Primero");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        cbxPerro = new JCheckBox("Perro");
        cbxPerro.setBounds(20,60,150,30);
        add(cbxPerro);

        cbxGato = new JCheckBox("Gato");
        cbxGato.setBounds(20,110,150,30);
        add(cbxGato);

        cbxRaton = new JCheckBox("Raton");
        cbxRaton.setBounds(20,160,150,30);
        add(cbxRaton);

        aceptar = new JButton("Aceptar");
        aceptar.setBounds(20,210,100,20);
        add(aceptar);

        salida = new JTextField();
        salida.setBounds(20,260,300,30);
        add(salida);

    }

    private void eventos(){

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Animales seleccionados : " + getMensagge());
            }
        });
    }


    private String getMensagge(){
        String mensaje ="";
        if ( cbxPerro.isSelected() ){
            mensaje = mensaje + "Perro";
        }

        if ( cbxGato.isSelected() ){
            mensaje = mensaje + " Gato";
        }

        if ( cbxRaton.isSelected() ){
            mensaje = mensaje + " Raton";
        }

        return mensaje;
    }


    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Primero imitador = new Primero();
                imitador.setSize(500,500);
                imitador.setVisible(true);
            }
        });
    }

}
