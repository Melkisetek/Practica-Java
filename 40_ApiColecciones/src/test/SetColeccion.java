package test;

import java.util.*;

public  class SetColeccion{
public static void main(String[] args) {
    /*Un Set no guarda el orden de los elementos con forme se van 
        agregando los elementos */

        Set miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //Utilizamos forEach
        // for(Object elemento: miSet){
        //     System.out.println("eleemnto: "+elemento);
        // }
        
        //Es de tipo estatico, sin necesidad de crear objetos - reutilizar código
        TestColeccion.imprimir(miSet);
       
}
 

 
}
