package interfazBD;

import arrayList.Persona;

import java.sql.*;

public class TrabajadorBD {

    public static void insertar(Trabajador tr){
        Connection connection = ConexionBD.getInstance();
        Statement stmt = null;


        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO Trabajador values('"+tr.getDni()+"', '"+tr.getNombre()+"'," +
                    " '"+tr.getPuesto()+"','"+tr.getFechaNacimiento()+"','"+tr.getDireccion()+"','"+tr.getTelefono()+
                    "'," +tr.getSalario()+",'"+tr.getFechaComienzoEmpresa()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Trabajador solicitarDatos(String dni){
        Connection connection = ConexionBD.getInstance();
        Statement stmt = null;
        Trabajador tr = null;
        ResultSet rs = null;

        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * from Trabajador where dni = '"+dni+"'");
            while (rs.next()) {
                tr = new Trabajador(rs.getString("DNI"),rs.getString("Nombre"),rs.getString("Puesto"),
                        rs.getDate("Fecha_Nacimiento"),rs.getString("Direccion"),rs.getString("Telefono"),
                        rs.getDouble("Salario"),rs.getDate("Fecha_com_Empresa"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tr;
    }
}
