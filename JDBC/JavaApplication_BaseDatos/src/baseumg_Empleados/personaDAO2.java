
package baseumg_Empleados;
import ModelsBase.empleadoclass;
import Conexion.Conectar;
import static Conexion.Conectar.close;
import static Conexion.Conectar.getConnection;

import java.sql.*;
import java.util.*;

public class personaDAO2 {
    private static final String SQL_SELECT = "SELECT id, Nombre, DPI, Nacimiento, Telefono, Direccion FROM baseumg.empleados";
    private static final String SQL_INSERT = "INSERT INTO empleados(Nombre, DPI, Nacimiento, Telefono, Direccion ) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE empleados SET Nombre = ?, DPI = ?, Nacimiento = ?, Telefono = ?, Direccion = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM empleados WHERE id = ?";
    
    public List<empleadoclass> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        empleadoclass persona = null;
        List<empleadoclass> personas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("Nombre");
                String DPI = rs.getString("DPI");
                String fechaNacimiento = rs.getString("Nacimiento");
                String telefono = rs.getString("Telefono");
                String direccion = rs.getString("Direccion");
                
                persona = new empleadoclass(id, nombre, DPI, fechaNacimiento, telefono, direccion); //Revisar empleadoclass

                //persona = new Persona(idPersona, nombre, apellido, email, telefono);

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
    public int insertar(empleadoclass persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conectar.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getDPI());
            stmt.setString(3, persona.getFechaNacimiento());
            stmt.setString(4,persona.getTelefono());
            stmt.setString(5,persona.getDireccion());
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
    public int actualizar (empleadoclass persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conectar.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getDPI());
            stmt.setString(3, persona.getFechaNacimiento());
            stmt.setString(4,persona.getTelefono());
            stmt.setString(5,persona.getDireccion());
            stmt.setInt(6, persona.getId());
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
    public int eliminar (empleadoclass persona){
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
