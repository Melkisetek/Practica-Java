
package Conectar;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloDatos modelo;
    private Connection con;
    
    public ControlDatos (){
        conectar = new Conectar();
        modelo = new ModeloDatos();
    }
    
    public void insertar(String nombre, int edad, String sexo){
        PreparedStatement ps;
        String sql;
        modelo.setNombre(nombre);
        modelo.setEdad(edad);
        modelo.setSexo(sexo);
        
        try {
            con = conectar.getConexion();
            sql = "INSERT INTO datos(nombre, edad, sexo) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modelo.getNombre());
            ps.setInt(2, modelo.getEdad());
            ps.setString(3, modelo.getSexo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
        
    }
    
    
}
