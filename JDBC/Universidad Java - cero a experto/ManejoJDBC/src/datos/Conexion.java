
package datos;

import java.sql.*;



public class Conexion {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/testmenk?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="Admin";
    
    //Creamos un método para la configuración de la conexión
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        
    }
    //Agregamos métodos para cerrar los objetos que hemos abieto
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
    
}


