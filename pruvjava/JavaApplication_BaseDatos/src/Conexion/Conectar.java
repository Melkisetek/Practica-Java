
package Conexion;

import java.sql.*;
import java.sql.DriverManager;

public class Conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/baseumg";
    
    public static final String USER = "root";
    public static final String CLAVE = "Admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER, CLAVE);
        
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
    return con;
    }

}
