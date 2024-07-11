package test;
import domain.Persona;
public class TestArreglosObject {
    public static void main(String[] args) {
        //definir un arreglo de tipo objeto.
        Persona personas[]=new Persona[2];

        personas[0]=new Persona("Otto");
        personas[1]=new Persona("Roberto");

        System.out.println("personas 0: "+personas[0]);
        System.out.println("personas 1:"+personas[1]);

        //Uso de for con arreglos.
        for(int i=0;i<personas.length;++i){
            System.out.println("personas "+i+" = "+personas[i]);
        }

    }
}
