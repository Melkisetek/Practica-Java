package pasoporreferencia;
import clases.Persona;  
public class PasoPorReferencia{
    public static void main(String[] args) {
        //Creacion de un metodo
	Persona persona1=new Persona();
        persona1.nombre="Mario";
        System.out.println("persona1 nombre: "+persona1.nombre);

        //cambiarValor(persona1);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: "+persona1.nombre);
    }

    /*public static void cambiarValor(Persona persona){
        persona.nombre="Karla";//cambiando nombre. 
    } */
    
    //metodo con return
    public static Persona cambiarValor(Persona persona){
        persona.nombre="Karla";

        return persona;
    }


}   
