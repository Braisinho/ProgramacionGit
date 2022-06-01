package interfazBD;


import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyTableModel extends AbstractTableModel {

    private final String[] columNames = {"DNI", "Nombre" ,"Puesto", "Fecha_Nacimiento" ,"Direccion",
            "Telefono", "Salario", "Fecha_Com_Empresa", "Verificar"};

    private static final int dni = 0;
    private static final int nombre = 1;
    private static final int puesto = 2;
    private static final int fecha_Nacimeinto = 3;
    private static final int direccion = 4;
    private static final int telefono = 5;
    private static final int salario = 6;
    private static final int fecha_con_empresa = 7;
    private static final int jc = 8;



    private ArrayList<Trabajador> al_trabajadores = TrabajadorBD.solicitarTablaTrabajadores();

    @Override
    public int getRowCount() {
        return al_trabajadores.size();
    }

    @Override
    public int getColumnCount() {
        return columNames.length;
    }

    public String getColumnName(int col){
        return columNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trabajador t = al_trabajadores.get(rowIndex);
        switch (columnIndex){
            case dni: return t.getDni();
            case nombre: return t.getNombre();
            case puesto: return t.getPuesto();
            case fecha_Nacimeinto: return t.getFechaNacimiento();
            case direccion: return t.getDireccion();
            case telefono: return t.getTelefono();
            case salario: return t.getSalario();
            case fecha_con_empresa: return t.getFechaComienzoEmpresa();
            case jc: return t.isVerificar();
            default: return "";
        }
    }

    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }

    public boolean isCellEditable(int row, int col){
        return col >= 2;
    }


    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Tabla ALD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TableSortDemo newContentPane = new TableSortDemo();
        frame.setContentPane(newContentPane);

        JButton salir = new JButton("Salir");
        frame.add(salir);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConexionBD.cerrarConexion();
                System.exit(0);
            }
        });
        frame.setSize(600,500);
        frame.setVisible(true);
    }
}
