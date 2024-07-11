package dominio;

public class Persona {
    //atributos de tipo private
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //costructor con argumentos
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.eliminado=eliminado;
    }

    //metodo get para obtener la informacion.
    public String getNombre(){
        return this.nombre;
    }

    //método set para midificar el atributo.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    //Para crear un método se usa is, ya boolean es un tipo de pregunta.
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }

    public String toString(){
        return "Persona [nombre: "+this.nombre+", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+"]";
    }
}
