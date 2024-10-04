
package Conexion;
import ModelsBase.proveedoresClass;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControlDatos2 {
    private Conectar conectar;
    private proveedoresClass modelo;
    private Connection con;
    
    public ControlDatos2(){
        conectar = new Conectar();
        modelo = new proveedoresClass(); //Para que funcione comente lo creado en empleadoclass
    }
    
    public void insertar(String codigoProveedor, String nombre, String telefono, String direccion){
        PreparedStatement ps;
        String sql;
        modelo.setCodigoProveedor(codigoProveedor);
        modelo.setNombre(nombre);
        modelo.setTelefono(telefono);
        modelo.setDireccion(direccion);
        
        try {
            con = conectar.getConexion();
            sql = "INSERT INTO proveedores(Codigo, Nombre, Telefono, Direccion) VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modelo.getCodigoProveedor());
            ps.setString(2, modelo.getNombre());
            ps.setString(3, modelo.getTelefono());
            ps.setString(4, modelo.getDireccion());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
        
    }
    
}
