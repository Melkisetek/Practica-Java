package domain;

public class Persona {
    private String nombre;

    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*toString sirve para ver una representación de cada uno de los atributos
     de nuestro objeto. */   
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }

    
    
}
