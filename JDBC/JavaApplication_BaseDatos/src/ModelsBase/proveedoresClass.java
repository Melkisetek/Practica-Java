
package ModelsBase;
//import ProyectoBase.Proveedores2;

/**
 *
 * @author Melquisedec
 */
public class proveedoresClass {
    private int id;
    private String codigoProveedor;
    private String nombre;
    private String telefono;
    private String direccion;
    
    //INSERT, UPDATE, DELETE
    //Construcor
    
//    public proveedoresClass(int id) {
//        this.id = id;
//    }
//    
//    public proveedoresClass(String codigoProveedor, String nombre, String telefono, String direccion) {
//        this.codigoProveedor = codigoProveedor;
//        this.nombre = nombre;
//        this.telefono = telefono;
//        this.direccion = direccion;
//    }
//    
//    public proveedoresClass(int id, String codigoProveedor, String nombre, String telefono, String direccion) {
//        this.id = id;
//        this.codigoProveedor = codigoProveedor;
//        this.nombre = nombre;
//        this.telefono = telefono;
//        this.direccion = direccion;
//    }
    
//    
    
    
    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
    
    
}
