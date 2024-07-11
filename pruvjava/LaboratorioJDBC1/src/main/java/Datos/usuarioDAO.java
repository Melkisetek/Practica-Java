
package Datos;
import static Datos.conexion.*;
import Dominio.usuario;
import java.sql.*;
import java.util.*;

public class usuarioDAO {
    private static final String SQL_SELECT = "SELECT id_Usuario, usuario, password FROM testmenk.usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_Usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_Usuario = ?";
    
    public List<usuario> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        usuario persona = null;
        List<usuario> personas = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idUsuario = rs.getInt("id_Usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                
                persona = new usuario(idUsuario, usuario, password);
                personas.add(persona);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                conexion.close(rs);
                conexion.close(stmt);
                conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            }
        return personas;
    }
    
    // Metodo INSERT
    public int insertar(usuario persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getUsuario());
            stmt.setString(2, persona.getPassword());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
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
    public int actualizar(usuario persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getUsuario());
            stmt.setString(2, persona.getPassword());
            stmt.setInt(3, persona.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
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
    public int eliminar(usuario persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
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
