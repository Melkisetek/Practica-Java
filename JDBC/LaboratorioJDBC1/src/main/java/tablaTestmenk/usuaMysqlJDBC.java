
package tablaTestmenk;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuaMysqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testmenk?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "Admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_Usuario, usuario, password FROM usuario";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            instruccion.close();
            conexion.close();
            resultado.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex){
            Logger.getLogger(usuaMysqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
