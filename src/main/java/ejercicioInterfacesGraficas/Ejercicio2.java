package ejercicioInterfacesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

    private JTextField txf;
    private JButton btn;
    private JLabel lbl;
    private JLabel lbl2;
    private JComboBox<String> cbx;


    public Ejercicio2(){
        super("Ejercicio 2");
        inicializar();
    }

    private void inicializar(){
        setLayout(null);
        this.txf = new JTextField();
        this.txf.setBounds(20,40,560, 30);
        add(this.txf);

        this.lbl = new JLabel("Introduce tu Aficion");
        this.lbl.setBounds(20,10,560,30);
        add(this.lbl);

        this.btn = new JButton("Añadir");
        this.btn.setBounds(20,70,100,30);
        add(this.btn);

        this.btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbx.addItem(txf.getText());
                txf.setText(null);
            }
        });

        this.lbl2 = new JLabel("Listado de aficiones");
        this.lbl2.setBounds(20,150,560,30);
        add(this.lbl2);

        this.cbx = new JComboBox<>();
        this.cbx.setBounds(20,180,300,30);
        add(this.cbx);

    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio2 lista = new Ejercicio2();
                lista.setSize(600,600);
                lista.setVisible(true);
            }
        });
    }
}
