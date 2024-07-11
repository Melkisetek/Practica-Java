package clases;

public class PruebaPersona {
   public static void main(String[] args) {
    Persona persona1;
    persona1 = new Persona();
    persona1.nombre = "Marcos";
    persona1.apellido = "Perez";
    persona1.desplegarInformacion();

    Persona persona2 = new Persona();
    persona2.nombre = "Mateo";
    persona2.apellido = "Hernadez";
    persona2.desplegarInformacion();

    
   }
}
