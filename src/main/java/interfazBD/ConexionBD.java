package interfazBD;
import java.math.BigDecimal;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConexionBD {

    private static Connection con;

    private ConexionBD(){
        try {
            String connectionStr = "jdbc:mysql://127.0.0.1:3306/Proyectos?user=myslqMF&password=abc123.";
            con = DriverManager.getConnection(connectionStr);
        }catch (SQLException e) {
                e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if ( con == null ){
            new ConexionBD();
        }
        return con;
    }
}
