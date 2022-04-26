package interfazBD;

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
                if (connection != null) {
                    connection.close();
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
