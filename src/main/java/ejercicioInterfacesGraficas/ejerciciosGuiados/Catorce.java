package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catorce extends JFrame {

    private JFileChooser ventanaGuardado;
    private JMenuBar mbr;
    private JMenu menu1;
    private JMenuItem guardar;
    private JMenuItem abrir;

    public Catorce(){
        super("Catorce");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        mbr = new JMenuBar();
        setJMenuBar(mbr);

        menu1 = new JMenu("Archivo");
        mbr.add(menu1);

        abrir = new JMenuItem("Abrir");
        menu1.add(abrir);

        guardar = new JMenuItem("Guardar");
        menu1.add(guardar);

        ventanaGuardado = new JFileChooser();
        add(ventanaGuardado);

    }

    private void eventos(){
        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resp;

                resp=ventanaGuardado.showOpenDialog(Catorce.this);

                if (resp==JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null,ventanaGuardado.getSelectedFile().toString());

                } else if (resp==JFileChooser.CANCEL_OPTION) {

                    JOptionPane.showMessageDialog(null,"Se pulsó la opción Cancelar");
                }
            }
        });

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Catorce ventana = new Catorce();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
