
package baseumg_Proveedores;

import Conexion.Conectar;
import static Conexion.Conectar.close;
import static Conexion.Conectar.getConnection;
import ModelsBase.proveedoresClass;

import java.sql.*;
import java.util.*;
public class proveedorDAO {
    private static final String SQL_SELECT = "SELECT id, Codigo, Nombre, Telefono, Direccion FROM baseumg.proveedores";
    private static final String SQL_INSERT = "INSERT INTO proveedores(Codigo, Nombre, Telefono, Direccion ) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE proveedores SET Codigo = ?, Nombre = ?, Telefono = ?, Direccion = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM proveedores WHERE id = ?";
    
    public List<proveedoresClass> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        proveedoresClass persona = null;
        List<proveedoresClass> personas = new ArrayList<>();
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String codigoProveedor = rs.getString("Codigo");
                String nombre = rs.getString("Nombre");
                String telefono = rs.getString("Telefono");
                String direccion = rs.getString("Direccion");
                
                persona = new proveedoresClass(id, codigoProveedor, nombre, telefono, direccion); //Revisar empleadoclass

                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                
                Conectar.close(rs);
                Conectar.close(stmt);
                Conectar.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
        
    }
    
     // Metodo INSERT
    public int insertar(proveedoresClass persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conectar.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getCodigoProveedor());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3,persona.getTelefono());
            stmt.setString(4,persona.getDireccion());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros; 
    }
    
           //# metodo update
    public int actualizar (proveedoresClass persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conectar.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,persona.getCodigoProveedor());
            stmt.setString(2,persona.getNombre());
            stmt.setString(3,persona.getTelefono());
            stmt.setString(4,persona.getDireccion());
            stmt.setInt(5,persona.getId());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros; 
    }
    
            //metodo #eliminar
    public int eliminar (proveedoresClass persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conectar.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out); 
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros; 
    }
    

}
