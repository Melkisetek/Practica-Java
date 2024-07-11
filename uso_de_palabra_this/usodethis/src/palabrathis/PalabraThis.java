package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona=new Persona("Mendez", "Ochoa");
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
}
