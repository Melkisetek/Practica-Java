package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10; //Ya no se puede cambiar el valor, debido que esta marcado como final.
        System.out.println("miVariable = "+miVariable);


        System.out.println("MI CONSTANTE = "+Persona.MI_CONSTANTE);

        //Objeto
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Marcos");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Lucas");
        System.out.println("persona2 nombre: "+persona1.getNombre());

        
    }
}
