
package Conexion;
import ModelsBase.empleadoclass;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class controlDatos1 {
    private final Conectar conectar;
    private final empleadoclass modelo;
    private Connection con;
    
    public controlDatos1(){
        conectar = new Conectar();
        modelo = new empleadoclass();//Para que funcione comente lo creado en empleadoclass
    }
    
   
    public void insertar(String nombre, String DPI, String fechaNacimiento, String telefono, String direccion){
        PreparedStatement ps;
        String sql;
        modelo.setNombre(nombre);
        modelo.setDPI(DPI);
        modelo.setFechaNacimiento(fechaNacimiento);
        modelo.setTelefono(telefono);
        modelo.setDireccion(direccion);
        
        
         try {
            con = conectar.getConexion();
            sql = "INSERT INTO empleados(Nombre,DPI,Nacimiento,Telefono,Direccion) VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modelo.getNombre());
            ps.setString(2, modelo.getDPI());
            ps.setString(3, modelo.getFechaNacimiento());
            ps.setString(4, modelo.getTelefono());
            ps.setString(5, modelo.getDireccion());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
         }
        
     }

    public void insertar(String nombre, int DPI, String fechaNacimiento, int telefono, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
    
}
