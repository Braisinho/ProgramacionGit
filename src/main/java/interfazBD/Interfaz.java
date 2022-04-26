package interfazBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    }

    private void eventos(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date fechaNacimiento = null;
                Date fechaEmpresa = null;
                try {
                    fechaNacimiento = (Date) new SimpleDateFormat("yyyy/MM/dd").parse(txt4.getText());
                    fechaEmpresa = (Date) new SimpleDateFormat("yyyy/MM/dd").parse(txt8.getText());
                    TrabajadorBD.insertar(new Trabajador(txt1.getText(),txt2.getText(),txt3.getText(),fechaNacimiento,txt5.getText(),txt6.getText(),Double.parseDouble(txt7.getText()) ,fechaEmpresa));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

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
