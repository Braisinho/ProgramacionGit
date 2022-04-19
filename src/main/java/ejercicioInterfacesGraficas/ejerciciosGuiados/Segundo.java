package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Segundo extends JFrame {

    private JPanel colores;
    private JButton aceptar;
    private JTextField salida;
    private JRadioButton rbtRojo;
    private JRadioButton rbtVerde;
    private JRadioButton rbtAzul;
    private ButtonGroup agrupacionColores;

    public Segundo(){
        super("Segundo");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        colores = new JPanel();
        colores.setBounds(20,60,300,200);
        Border bordepanel1 = new TitledBorder(new EtchedBorder(), "Colores");
        colores.setBorder(bordepanel1);
        add(colores);

        rbtRojo = new JRadioButton("Rojo");
        rbtRojo.setBounds(50,90,100,20);
        add(rbtRojo);

        rbtAzul = new JRadioButton("Azul");
        rbtAzul.setBounds(50,130,100,20);
        add(rbtAzul);

        rbtVerde = new JRadioButton("Verde");
        rbtVerde.setBounds(50,170,100,20);
        add(rbtVerde);

        agrupacionColores = new ButtonGroup();
        agrupacionColores.add(rbtRojo);
        agrupacionColores.add(rbtAzul);
        agrupacionColores.add(rbtVerde);

        aceptar = new JButton("Aceptar");
        aceptar.setBounds(20,310,100,20);
        add(aceptar);

        salida = new JTextField();
        salida.setBounds(20,360,300,20);
        add(salida);
    }

    private void eventos(){
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Color elegido : " + getMensagge());
            }
        });
    }

    private String getMensagge(){
        String mensaje ="";
        if ( rbtVerde.isSelected() ){
            mensaje = mensaje + " Verde";
        }

        if ( rbtRojo.isSelected() ){
            mensaje = mensaje + " Rojo";
        }

        if ( rbtAzul.isSelected() ){
            mensaje = mensaje + " Azul";
        }

        return mensaje;
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Segundo ventana = new Segundo();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
