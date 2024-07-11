package domain;
import java.io.Serializable;
//Para que se considere un Beans, debe cumplir con ciertas caracteristicas.
public class Persona implements Serializable{
    private String nombre;
    private String apellido;

    //Obligatorio un constructor vacío
    public Persona(){
        
    }
    //Ya no es requerido pero, lo agregamos para inicializar los atributos de la clase.
    public Persona(String nombre, String apellido){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    
}