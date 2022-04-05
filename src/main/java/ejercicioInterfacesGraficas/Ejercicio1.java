package ejercicioInterfacesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {


    private JTextField txf;
    private JButton btn;
    private JLabel lbl;


    public Ejercicio1(){
        super("Ejercicio 1");
        inicializar();
    }

    private void inicializar(){
        setLayout(null);
        this.txf = new JTextField();
        this.txf.setBounds(20,40,560, 30);
        add(this.txf);

        this.lbl = new JLabel("Introduce tu nombre");
        this.lbl.setBounds(20,10,560,30);
        add(this.lbl);

        this.btn = new JButton("Saludar");
        this.btn.setBounds(20,70,100,30);
        add(this.btn);

        this.btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + txf.getText() );
            }
        });

    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio1 primerSaludo = new Ejercicio1();
                primerSaludo.setSize(600,600);
                primerSaludo.setVisible(true);
            }
        });
    }



}


