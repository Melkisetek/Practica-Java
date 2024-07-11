package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[]={5,6,8,9};
        for(int edad: edades){
            System.out.println("edad = "+edad);
        }
        //No se puede iterar un indice de forEach, usar for clasico.
    
        Persona personas[]={new Persona("Juan"), new Persona("Alicia"), new Persona("Ana")};
        for(Persona persona: personas){
            System.out.println("persona = "+persona);
        }
    }
}
