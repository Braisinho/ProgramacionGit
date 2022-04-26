package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;

public class Quince2 extends JFrame {

    private JLabel lbl;
    private JScrollPane scroll;
    private JPanel panel;

    public Quince2(){
        super("Quince");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        lbl = new JLabel("Ejemplo de ScrollPane");
        lbl.setBounds(0,0,400,30);
        add(lbl);

        scroll = new JScrollPane();
        scroll.setBounds(0,30, 500, 500);

        panel = new JPanel();
        panel.setBounds(0,0,1000,1000);

        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setViewportView(panel);

        add(scroll);

    }

    private void eventos(){

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Quince2 ventana = new Quince2();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
