
package baseumg_Proveedores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseMysqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/baseumg?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root","Admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id, Codigo, Nombre, Telefono, Direccion FROM proveedores";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()){
                System.out.print("id "+resultado.getInt("id"));
                System.out.print(" Codigo: "+resultado.getString("Codigo"));
                System.out.print(" Nombre: "+resultado.getString("Nombre"));
                System.out.print(" Telefono: "+resultado.getString("telefono"));
                System.out.print(" Direccion: "+resultado.getString("direccion"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            Logger.getLogger(BaseMysqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
