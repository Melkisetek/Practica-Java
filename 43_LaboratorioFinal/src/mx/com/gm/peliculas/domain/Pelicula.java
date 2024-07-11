package mx.com.gm.peliculas.domain;
//Clase dominio de nuestro sistema
public class Pelicula {
    private String nombre;

    public Pelicula(){

    }
    public Pelicula(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return this.nombre;
    }

    
    

}
