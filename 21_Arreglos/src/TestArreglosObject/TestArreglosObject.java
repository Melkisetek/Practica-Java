package TestArreglosObject;
import domain.Persona;
public class TestArreglosObject {
    public static void main(String[] args) {
        //definir un arreglo de tipo objeto.
        Persona personas[]=new Persona[2];
        //Inicializar
        personas[0]=new Persona("Otto");
        personas[1]=new Persona("Roberto");
        //imprimir utilizando get.
        System.out.println("personas 0: "+personas[0].getNombre());
        System.out.println("personas 1:"+personas[1].getNombre());

        //Uso de for con arreglos. Utilizando toString para mostra datos en consola 
        for(int i=0;i<personas.length;++i){
            System.out.println("personas "+i+" = "+personas[i]);
        }

    }
}
