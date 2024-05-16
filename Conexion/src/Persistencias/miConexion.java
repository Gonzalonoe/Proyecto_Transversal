
package Persistencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class miConexion {
    private String url;
    private String usuario;
    private String password;
    
    private static Connection conexion = null;
    
    public miConexion(String url, String usr, String pass){
        this.url = url;
        usuario = usr;
        password = pass;
    }
    
    public Connection buscarConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println("No se puede conectar o no se puede cargar el driver");
            }
        }
        return conexion;
    }
}
        
    

