package interfazBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


public class Interfaz extends JFrame {


    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField txt6;
    private JTextField txt7;
    private JTextField txt8;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JButton button;
    private JButton salir;
    private JButton consultarDatos;
    private JButton tabla;
    private static boolean visibilidad = false;

    public static void setVisibilidad(boolean visibilidad) {
        visibilidad = visibilidad;
    }

    public Interfaz(){
        super("Trabajadir");
        crearObjetos();
        eventos();
        setVisible(true);
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
        button.setBounds(250,400,100,20);
        add(button);

        salir = new JButton("Salir");
        salir.setBounds(10,400,100,20);
        add(salir);

        consultarDatos = new JButton("Consultar");
        consultarDatos.setBounds(120,400,120,20);
        add(consultarDatos);

        tabla = new JButton("Tablas");
        tabla.setBounds(360,400,100,20);
        add(tabla);

    }

    private void eventos(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date fechaNacimiento = Date.valueOf(txt4.getText());
                Date fechaEmpresa = Date.valueOf(txt8.getText());
                boolean seguridad;
                seguridad = TrabajadorBD.insertar(new Trabajador(txt1.getText(),txt2.getText(),txt3.getText(),fechaNacimiento,txt5.getText(),txt6.getText(),Double.parseDouble(txt7.getText()) ,fechaEmpresa));
                if ( seguridad ){
                    txt1.setText(null);
                    txt2.setText(null);
                    txt3.setText(null);
                    txt4.setText(null);
                    txt5.setText(null);
                    txt6.setText(null);
                    txt7.setText(null);
                    txt8.setText(null);
                }else{
                    JOptionPane.showMessageDialog(null,"El trabajador no se introdujo en la base de datos");
                }
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
                if ( p != null ){
                    txt2.setText(p.getNombre());
                    txt3.setText(p.getPuesto());
                    txt4.setText(p.getFechaNacimiento().toString());
                    txt5.setText(p.getDireccion());
                    txt6.setText(p.getTelefono());
                    txt7.setText(p.getSalario()+"");
                    txt8.setText(p.getFechaComienzoEmpresa().toString());
                }else{
                    JOptionPane.showMessageDialog(null,"El DNI: " +txt1.getText() + " no se encuentra en la base de datos");
                }

            }
        });

        tabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new InterfazTabla();
            }
        });

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz ventana = new Interfaz();
                ventana.setSize(500,500);
            }
        });
    }
}
