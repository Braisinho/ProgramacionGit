package miTablaLeñadores;

import interfazBD.Trabajador;

import javax.swing.table.AbstractTableModel;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class MyTableModel extends AbstractTableModel {

    private String[] columNames = {"DNI", "Nombre" ,"Puesto", "Fecha_Nacimiento" ,"Direccion",
            "Telefono", "Salario", "Fecha_Com_Empresa"  };

    private static final int dni = 0;
    private static final int nombre = 1;
    private static final int puesto = 2;
    private static final int fecha_Nacimeinto = 3;
    private static final int direccion = 4;
    private static final int telefono = 5;
    private static final int salario = 6;
    private static final int Fecha_con_empresa = 7;

    private Trabajador[] data_Trabajadores = {
            new Trabajador("46289242A", "Brais", "Jefe", Date.valueOf("1999-10-23"),"A estrada","606613625", 12500,Date.valueOf("2020-10-23")),
            new Trabajador("46289242B", "Brais", "Jefe", Date.valueOf("1999-10-23"),"A estrada","606613625", 12500,Date.valueOf("2020-10-23"))
    };

    private ArrayList<Trabajador> al_trabajadores = new ArrayList<>(Arrays.asList(data_Trabajadores));

    @Override
    public int getRowCount() {
        return data_Trabajadores.length;
    }

    @Override
    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trabajador t = data_Trabajadores[rowIndex];
        switch (columnIndex){
            case dni: return t.getDni();
            case nombre: return t.getNombre();
            case puesto: return t.getPuesto();
            case fecha_Nacimeinto: return t.getFechaNacimiento();
            case direccion: return t.getDireccion();
            case telefono: return t.getTelefono();
            case salario: return t.getSalario();
            case Fecha_con_empresa: return t.getFechaComienzoEmpresa();
            default: return "";
        }
    }

    public Class getColumClass(int c){
        return getValueAt(0,c).getClass();
    }

    public boolean isCellEditable(int row, int col){
        return col > 2;

    }

}
