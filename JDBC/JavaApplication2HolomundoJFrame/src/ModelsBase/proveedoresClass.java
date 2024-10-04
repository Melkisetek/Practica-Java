
package ModelsBase;
import ProyectoBase.Proveedores2;

/**
 *
 * @author Melquisedec
 */
public class proveedoresClass {
    public int codigoProveedor;
    String nombre;
    int telefono;
    String direccion;
    
    public proveedoresClass(int codigoProveedor, String nombre, int telefono, String direccion){
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
   

    public proveedoresClass(Proveedores2 aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getCodigo(){
        return codigoProveedor;
    }
    
    public void setCodigo(int codigoProveedor){
        this.codigoProveedor = codigoProveedor;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
