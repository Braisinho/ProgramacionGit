package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Veintiuno extends JFrame {

    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton sumar;
    private JButton restar;

    public Veintiuno(){
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        lblNumero1 = new JLabel("Numero1");
        lblNumero1.setBounds(10,10,100,20);
        add(lblNumero1);

        lblNumero2 = new JLabel("Numero2");
        lblNumero2.setBounds(10,90,100,20);
        add(lblNumero2);

        txtNumero1 = new JTextField("0");
        txtNumero1.setBounds(150,10,100,20);
        add(txtNumero1);

        txtNumero2 = new JTextField("0");
        txtNumero2.setBounds(150,90,100,20);
        add(txtNumero2);

        sumar = new JButton("Sumar");
        sumar.setBounds(10,170,100,20);
        add(sumar);

        restar = new JButton("Restar");
        restar.setBounds(150,170,100,20);
        add(restar);

    }

    private void eventos(){
        sumar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, Integer.parseInt( txtNumero1.getText()) + Integer.parseInt(txtNumero2.getText()));
            }
        });

        restar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, Integer.parseInt( txtNumero1.getText()) - Integer.parseInt(txtNumero2.getText()));
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Veintiuno ventana = new Veintiuno();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
