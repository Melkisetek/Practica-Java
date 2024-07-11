package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1=new Persona("Marvin");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        System.out.println("persona1 con static contadorPersonas: "+persona1.getIdPersona());

        Persona persona2=new Persona("Eida");
        System.out.println("persona2 nombre: "+persona2.getNombre());
        System.out.println("persona2 con static contadorPersonas: "+persona2.getIdPersona());
    }
}
