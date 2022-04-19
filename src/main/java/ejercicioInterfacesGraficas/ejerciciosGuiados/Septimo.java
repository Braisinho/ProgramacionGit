package ejercicioInterfacesGraficas.ejerciciosGuiados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Septimo extends JFrame {

    private JTextField precioBase;
    private JToggleButton instalacion;
    private JToggleButton formacion;
    private JToggleButton alimentacion;
    private JButton calcular;
    private JLabel lblPrecio;
    private JLabel lblInstalacion;
    private JLabel lblalimentacion;
    private JLabel lblformacion;
    private JLabel vacia;

    public Septimo(){
        super("Septimo");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        lblPrecio = new JLabel("Precio Base");
        lblPrecio.setBounds(20,20,150,20);
        add(lblPrecio);

        precioBase = new JTextField();
        precioBase.setBounds(20,50,150,20);
        add(precioBase);

        instalacion = new JToggleButton("Instalación");
        instalacion.setBounds(20,100,150,20);
        add(instalacion);

        lblInstalacion = new JLabel("40");
        lblInstalacion.setBounds(180,100,150,20);
        add(lblInstalacion);

        formacion = new JToggleButton("Formacion");
        formacion.setBounds(20,130,150,20);
        add(formacion);

        lblformacion = new JLabel("200");
        lblformacion.setBounds(180,130,150,20);
        add(lblformacion);

        alimentacion = new JToggleButton("Alimentacion BD");
        alimentacion.setBounds(20,160,150,20);
        add(alimentacion);

        lblalimentacion = new JLabel("200");
        lblalimentacion.setBounds(180,160,150,20);
        add(lblalimentacion);

        calcular = new JButton("Calcular");
        calcular.setBounds(20,360,150,20);
        add(calcular);

        vacia = new JLabel();
        vacia.setBounds(20,390,150,50);
        vacia.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(vacia);
    }

    private void eventos(){

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vacia.setText(calcularPrecio() + " €");
            }
        });

    }

    private int calcularPrecio(){
        int precioInicial = Integer.parseInt(precioBase.getText());
        int precioIntalacion = Integer.parseInt(lblInstalacion.getText());
        int precioFormacion = Integer.parseInt(lblformacion.getText());
        int precioAlimentacion = Integer.parseInt(lblalimentacion.getText());
        int precioFinal = precioInicial;

        if ( instalacion.isSelected() ){
            precioFinal += precioIntalacion;
        }
        if ( formacion.isSelected() ){
            precioFinal += precioFormacion;
        }
        if ( alimentacion.isSelected() ){
            precioFinal += precioAlimentacion;
        }
        return precioFinal;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Septimo ventana = new Septimo();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
