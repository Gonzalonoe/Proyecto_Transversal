package AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/";
    private static final String bd = "ulp";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection connection;

    private Conexion() {
    }

    ;
    public static Connection getConnection() {
        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(url, usuario, password);
                JOptionPane.showMessageDialog(null, "SE CONECTO EXITOSAMENTE A LA BD.");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de Datos.");
            }

        }

        return connection;
    }
}
