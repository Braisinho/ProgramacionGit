package interfazBD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


public class Interfaz extends JFrame {

    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JTextField txt4;
    public JTextField txt5;
    public JTextField txt6;
    public JTextField txt7;
    public JTextField txt8;
    public JLabel lbl1;
    public JLabel lbl2;
    public JLabel lbl3;
    public JLabel lbl4;
    public JLabel lbl5;
    public JLabel lbl6;
    public JLabel lbl7;
    public JLabel lbl8;
    public JButton button;
    public JButton salir;
    public JButton consultarDatos;



    public Interfaz(){
        super("Trabajadir");
        crearObjetos();
        eventos();
    }

    private void crearObjetos(){
        setLayout(null);

        lbl1 = new JLabel("DNI");
        lbl1.setBounds(10,10,100,20);
        add(lbl1);

        txt1 = new JTextField();
        txt1.setBounds(200,10,100,20);
        add(txt1);

        lbl2 = new JLabel("Nombre");
        lbl2.setBounds(10,50,100,20);
        add(lbl2);

        txt2 = new JTextField();
        txt2.setBounds(200,50,100,20);
        add(txt2);

        lbl3 = new JLabel("Puesto");
        lbl3.setBounds(10,90,100,20);
        add(lbl3);

        txt3 = new JTextField();
        txt3.setBounds(200,90,100,20);
        add(txt3);

        lbl4 = new JLabel("Fecha Nacimiento");
        lbl4.setBounds(10,130,150,20);
        add(lbl4);

        txt4 = new JTextField();
        txt4.setBounds(200,130,100,20);
        add(txt4);

        lbl5 = new JLabel("Direccion");
        lbl5.setBounds(10,170,100,20);
        add(lbl5);

        txt5 = new JTextField();
        txt5.setBounds(200,170,100,20);
        add(txt5);

        lbl6 = new JLabel("Telefono");
        lbl6.setBounds(10,210,100,20);
        add(lbl6);

        txt6 = new JTextField();
        txt6.setBounds(200,210,100,20);
        add(txt6);

        lbl7 = new JLabel("Salario");
        lbl7.setBounds(10,250,100,20);
        add(lbl7);

        txt7 = new JTextField();
        txt7.setBounds(200,250,100,20);
        add(txt7);

        lbl8 = new JLabel("Fecha comienzo Empresa");
        lbl8.setBounds(10,290,150,20);
        add(lbl8);

        txt8 = new JTextField();
        txt8.setBounds(200,290,100,20);
        add(txt8);

        button = new JButton("Guardar");
        button.setBounds(300,400,100,20);
        add(button);

        salir = new JButton("Salir");
        salir.setBounds(10,400,100,20);
        add(salir);

        consultarDatos = new JButton("Consultar");
        consultarDatos.setBounds(150,400,120,20);
        add(consultarDatos);
    }

    private void eventos(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date fechaNacimiento = Date.valueOf(txt4.getText());
                Date fechaEmpresa = Date.valueOf(txt8.getText());
                TrabajadorBD.insertar(new Trabajador(txt1.getText(),txt2.getText(),txt3.getText(),fechaNacimiento,txt5.getText(),txt6.getText(),Double.parseDouble(txt7.getText()) ,fechaEmpresa));
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConexionBD.cerrarConexion();
                System.exit(0);
            }
        });

        consultarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trabajador p =  TrabajadorBD.solicitarDatos(txt1.getText());
                txt2.setText(p.getNombre());
                txt3.setText(p.getPuesto());
                txt4.setText(p.getFechaNacimiento().toString());
                txt5.setText(p.getDireccion());
                txt6.setText(p.getTelefono());
                txt7.setText(p.getSalario()+"");
                txt8.setText(p.getFechaComienzoEmpresa().toString());
            }
        });

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz ventana = new Interfaz();
                ventana.setSize(500,500);
                ventana.setVisible(true);
            }
        });
    }
}
