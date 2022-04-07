package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {

    JLabel etiNum1;
    JLabel etiNum2;
    JTextField txtNum1;
    JTextField txtNum2;
    JButton btnSumar;
    JButton btnRestar;

    public Vista(){
        initComponents();
        creacionVentana();
        eventos();
    }


    private void initComponents(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0,400,Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0,300,Short.MAX_VALUE)
        );
        pack();
    }


    private void creacionVentana(){
        this.setTitle("Programa Operaciones");
        this.setSize(500,300);
        this.setLocation(100,100);

        etiNum1 = new JLabel("Numero 1");
        etiNum1.setBounds(10,10,100,20);
        add(etiNum1);

        etiNum2 = new JLabel("Numero 2");
        etiNum2.setBounds(10,60,100,20);
        add(etiNum2);

        txtNum1 = new JTextField();
        txtNum1.setText("0");
        txtNum1.setBounds(110,10,100,20);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setText("0");
        txtNum2.setBounds(110,60,100,20);
        add(txtNum2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(10,120,100,20);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(150,120,100,20);
        add(btnRestar);
    }

    private void eventos(){

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int suma = Integer.parseInt(txtNum1.getText()) + Integer.parseInt(txtNum2.getText());
                    JOptionPane.showMessageDialog(null, suma);
                }catch (NumberFormatException ext){
                    JOptionPane.showMessageDialog(null, "Uno de los campos esta vacio, por favor corrigelo");
                }
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int resta = Integer.parseInt(txtNum1.getText()) - Integer.parseInt(txtNum2.getText());
                    JOptionPane.showMessageDialog(null, resta);
                }catch (NumberFormatException ext){
                    JOptionPane.showMessageDialog(null, "Uno de los campos esta vacio, por favor corrigelo");
                }
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
}
