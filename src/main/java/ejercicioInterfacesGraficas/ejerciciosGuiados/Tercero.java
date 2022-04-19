package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tercero extends JFrame {

    private JList<String> lista;
    private JTextField salida;
    private JButton aceptar;

    public Tercero(){
        super("Tercero");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        String[] colores = new String[]{"Rojo", "Verde", "Azul"};
        lista = new JList<>(colores);
        lista.setBounds(20,60,150,200);
        add(lista);

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
                salida.setText(mensagge());
            }
        });
    }

    private String mensagge(){
        String mensaje = "";

        if ( lista.getSelectedIndex() == -1){
            mensaje = "No hay colores seleccionados";
        }else{
            mensaje = "El color seleccionado es: " +lista.getSelectedValue().toString();
        }

        return mensaje;
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tercero ventana = new Tercero();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
