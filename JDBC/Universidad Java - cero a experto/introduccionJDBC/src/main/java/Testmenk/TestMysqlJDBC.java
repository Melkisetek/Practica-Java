//Seccion 44: Vídeo 175

package Testmenk;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestMysqlJDBC { //psvm=atajo de escritura de main
    public static void main(String[] args) {
        // La ruta de la BD
        String url = "jdbc:mysql://localhost:3306/testmenk?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //colocamos nombre de la clase de mysql - 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // propiedad tipo Connection
            Connection conexion = DriverManager.getConnection(url,"root","Admin");
            // crear objeto statement, permite ejecutar sentencias sobre la tabla de BD
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            //ejecutar instrucción, utilizar el tipo interface ResultSet
            ResultSet resultado = instruccion.executeQuery(sql);
            // iterar los posibles resultados dentro de ResultSEt (cada registro en la BD)
            while (resultado.next()){
                //solo print sin salto de línea
                System.out.print("Id Persona "+resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+resultado.getString("nombre"));
                System.out.print(" Apellido: "+resultado.getString("apellido"));
                System.out.print(" Email: "+resultado.getString("email"));
                System.out.print(" Telefono: "+resultado.getString("telefono"));
                System.out.println("");
            }

            // Cerrar los flujos de manera inversa, de cada objeto 
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            System.out.println("Error en la conexión de la BD");
            Logger.getLogger(TestMysqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 