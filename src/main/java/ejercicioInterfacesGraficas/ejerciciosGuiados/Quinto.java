package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quinto extends JFrame {

    private JList<String> lista;
    private JButton curso1;
    private JButton curso2;
    private JTextField salida;

    public Quinto(){
        super("Quinto");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        lista = new JList<>();
        lista.setBounds(20,60,150,200);
        add(lista);

        curso1 = new JButton("Curso 1");
        curso1.setBounds(20,310,100,20);
        add(curso1);

        curso2 = new JButton("Curso 2");
        curso2.setBounds(20,350,100,20);
        add(curso2);

        salida = new JTextField();
        salida.setBounds(200,60,150,20);
        add(salida);
    }

    private void eventos(){

        curso1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.addElement("Juan");
                modelo.addElement("Maria");
                modelo.addElement("Luis");
                lista.setModel(modelo);

            }
        });

        curso2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo2 = new DefaultListModel();
                modelo2.addElement("Ana");
                modelo2.addElement("Marta");
                modelo2.addElement("Jose");
                lista.setModel(modelo2);

            }
        });

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if ( lista.getSelectedValue() != null ){
                    salida.setText(lista.getSelectedValue().toString());
                } else {
                    salida.setText(null);
                }

            }
        });

    }



    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Quinto ventana = new Quinto();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
