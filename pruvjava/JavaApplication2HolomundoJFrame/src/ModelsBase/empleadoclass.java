
package ModelsBase;

import ProyectoBase.Empleados2;


public class empleadoclass {
    private String nombre;
    private int DPI;
    private String fechaNacimiento;
    private int telefono;
    private String direcion;

    public empleadoclass(String nombre, int DPI, String fechaNacimiento, int telefono, String direcion) {
        this.nombre = nombre;
        this.DPI = DPI;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direcion = direcion;
}

    public empleadoclass(Empleados2 aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getdirecion() {
        return direcion;
    }

    public void setdirecion(String direcion) {
        this.direcion = direcion;
    }
    
    public String getNameDpi(){
        String resultado;
        resultado = DPI+"-"+nombre;
        return resultado;
    }

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}