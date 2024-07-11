
package ModelsBase;

//import ProyectoBase.Empleados2;


public class empleadoclass {
    private int id;
    private String nombre;
    private String DPI;
    private String fechaNacimiento;
    private String telefono;
    private String direccion;

    //INSERT, UPDATE, DELETE
    //Construcor
    
//    public empleadoclass(int id) {
//        this.id = id;
//    }
//    
//    public empleadoclass(String nombre, String DPI, String fechaNacimiento, String telefono, String direccion) {
//        this.nombre = nombre;
//        this.DPI = DPI;
//        this.fechaNacimiento = fechaNacimiento;
//        this.telefono = telefono;
//        this.direccion = direccion;
//    }
//    
//    public empleadoclass(int id, String nombre, String DPI, String fechaNacimiento, String telefono, String direccion) {
//       this.id = id;
//        this.nombre = nombre;
//        this.DPI = DPI;
//        this.fechaNacimiento = fechaNacimiento;
//        this.telefono = telefono;
//        this.direccion = direccion;
//    }
    
    //x
//prueba
    
   // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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