package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sexto extends JFrame {

    private JComboBox<String> numeros;
    private JButton pares;
    private JButton impares;
    private JTextField salida;

    public Sexto(){
        super("Sexto");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        numeros = new JComboBox<>();
        numeros.setBounds(10,40,150,20);
        add(numeros);

        pares = new JButton("Pares");
        pares.setBounds(200,40,100,20);
        add(pares);

        impares = new JButton("Pares");
        impares.setBounds(340,40,100,20);
        add(impares);

        salida = new JTextField();
        salida.setBounds(10,400,150,20);
        add(salida);

    }

    private void eventos(){

        pares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;

                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                for (i=0;i<10;i+=2) {
                    modelo.addElement("Nº "+i);
                }
                numeros.setModel(modelo);
            }
        });

        impares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;

                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                for (i=1;i<11;i+=2) {
                    modelo.addElement("Nº "+i);
                }
                numeros.setModel(modelo);
            }
        });

        numeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText(numeros.getSelectedItem().toString());
            }
        });

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Sexto ventana = new Sexto();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
