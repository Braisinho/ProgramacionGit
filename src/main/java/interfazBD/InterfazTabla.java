package interfazBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazTabla extends JFrame {

    private JButton atras;

    public InterfazTabla(){
        setSize(500,500);
        setVisible(true);
        inicializar();
        eventos();
    }

    private void inicializar(){
        setLayout(null);

        atras = new JButton("Atras");
        atras.setBounds(300,300,90,20);
        add(atras);
    }

    private void eventos(){
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Interfaz.setVisibilidad(true);
            }
        });
    }
}
