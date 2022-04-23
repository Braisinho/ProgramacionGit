package ejercicioInterfacesGraficas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Ejercicio3 extends JFrame {

    private JLabel lbl;
    private JLabel lblCopia;
    private JTextField txf;
    private JTextField txfCopia;
    private JComboBox<String> cbx;
    private JComboBox<String> cbxCopia;
    private JRadioButton rdb1;
    private JRadioButton rdb2;
    private JRadioButton rdb3;
    private ButtonGroup grupo;
    private JRadioButton rdbCopia1;
    private JRadioButton rdbCopia2;
    private JRadioButton rdbCopia3;
    private ButtonGroup grupoCopia;
    private JCheckBox ckb1;
    private JCheckBox ckb2;
    private JCheckBox ckb3;
    private JCheckBox ckbCopia1;
    private JCheckBox ckbCopia2;
    private JCheckBox ckbCopia3;
    private JSpinner spn;
    private JSpinner spnCopia;



    public Ejercicio3(){
        super("Imitador");
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        setLocation(700,300);


        lbl = new JLabel("Original");
        lbl.setBounds(10,0,100, 20);
        add(lbl);

        lblCopia = new JLabel("Espejo");
        lblCopia.setBounds(10,230,100,20);
        add(lblCopia);

        txf = new JTextField();
        txf.setBounds(350,40, 125,30);
        add(txf);

        txfCopia = new JTextField();
        txfCopia.setBounds(350,290,125,30);
        add(txfCopia);

        cbx = new JComboBox<>();
        cbx.setBounds(350,80,125,30);
        cbx.addItem("Item 1");
        cbx.addItem("Item 2");
        cbx.addItem("Item 3");
        add(cbx);

        cbxCopia = new JComboBox<>();
        cbxCopia.setBounds(350,330,125,30);
        cbxCopia.addItem("Item 1");
        cbxCopia.addItem("Item 2");
        cbxCopia.addItem("Item 3");
        add(cbxCopia);

        spn = new JSpinner();
        spn.setBounds(350,120,125,30);
        add(spn);

        spnCopia = new JSpinner();
        spnCopia.setBounds(350,370,125,30);
        add(spnCopia);

        rdb1 = new JRadioButton("Opcion 1");
        rdb2 = new JRadioButton("Opcion 2");
        rdb3 = new JRadioButton("Opcion 3");
        rdb1.setBounds(40,40,125,30);
        rdb2.setBounds(40,70,125,30);
        rdb3.setBounds(40,100,125,30);
        add(rdb1);
        add(rdb2);
        add(rdb3);
        grupo = new ButtonGroup();
        grupo.add(rdb1);
        grupo.add(rdb2);
        grupo.add(rdb3);

        rdbCopia1 = new JRadioButton("Opcion 1");
        rdbCopia2 = new JRadioButton("Opcion 2");
        rdbCopia3 = new JRadioButton("Opcion 3");
        rdbCopia1.setBounds(40,250,125,30);
        rdbCopia2.setBounds(40,280,125,30);
        rdbCopia3.setBounds(40,310,125,30);
        add(rdbCopia1);
        add(rdbCopia2);
        add(rdbCopia3);
        grupoCopia = new ButtonGroup();
        grupoCopia.add(rdbCopia1);
        grupoCopia.add(rdbCopia2);
        grupoCopia.add(rdbCopia3);

        ckb1 = new JCheckBox("Opcion 1");
        ckb2 = new JCheckBox("Opcion 2");
        ckb3 = new JCheckBox("Opcion 3");
        ckb1.setBounds(170,40,125,30);
        ckb2.setBounds(170,70,125,30);
        ckb3.setBounds(170,100,125,30);
        add(ckb1);
        add(ckb2);
        add(ckb3);

        ckbCopia1 = new JCheckBox("Opcion 1");
        ckbCopia2 = new JCheckBox("Opcion 2");
        ckbCopia3 = new JCheckBox("Opcion 3");
        ckbCopia1.setBounds(170,250,125,30);
        ckbCopia2.setBounds(170,280,125,30);
        ckbCopia3.setBounds(170,310,125,30);
        add(ckbCopia1);
        add(ckbCopia2);
        add(ckbCopia3);


        //Deshabilitamos la segunda parte
        ckbCopia1.setEnabled(false);
        ckbCopia2.setEnabled(false);
        ckbCopia3.setEnabled(false);

        rdbCopia1.setEnabled(false);
        rdbCopia2.setEnabled(false);
        rdbCopia3.setEnabled(false);

        txfCopia.setEnabled(false);
        spnCopia.setEnabled(false);
        cbxCopia.setEnabled(false);


    }

    private void eventos(){
        rdb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdbCopia1.setSelected(rdb1.isSelected());
            }
        });

        rdb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdbCopia2.setSelected(rdb2.isSelected());
            }
        });

        rdb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdbCopia3.setSelected(rdb3.isSelected());
            }
        });

        ckb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckbCopia1.setSelected(ckb1.isSelected());
            }
        });

        ckb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckbCopia2.setSelected(ckb2.isSelected());
            }
        });

        ckb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckbCopia3.setSelected(ckb3.isSelected());
            }
        });

        txf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txfCopia.setText(txf.getText());
            }
        });

        cbx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbxCopia.setSelectedItem(cbx.getSelectedItem());
            }
        });

        spn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spnCopia.setValue(spn.getValue());
            }
        });

    }


    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio3 imitador = new Ejercicio3();
                imitador.setSize(500,500);
                imitador.setVisible(true);
            }
        });
    }

}
