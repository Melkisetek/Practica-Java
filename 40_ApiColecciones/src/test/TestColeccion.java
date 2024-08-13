package test;
import java.util.*;
public class TestColeccion{
    public static void main(String[] args) {
        /*Una lista de tipo List mantiene el orden en el cual se van 
        agregando los elementos*/
        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");


       // imprimir(miLista); //Método utilizando polimorfismo

        //for(Object elemento: miLista){
        //    System.out.println("elemento = "+elemento );
        //}
        
        

    

       //Map -----------------------------------------
       //Map hereda de la interface Map y la clase asociada es HashMap
       Map miMapa = new HashMap<>();
       miMapa.put("Valor1", "Juan");
       miMapa.put("Valor2", "Orlando");
       miMapa.put("Valor3", "jiren");
       miMapa.put(23, "Número");
   
       //String elemento = (String) miMapa.get("Valor1");
       //System.out.println("elemento = "+elemento);



       //imprimir(miMapa.keySet());//imprimir llaves no mantiene orden
       imprimir(miMapa.values());//imprimir valores
       
    }

    public static void imprimir(Collection coleccion){
        //for(Object elemento: coleccion){
        //    System.out.println("elemento = "+elemento);
        //}
        //Tambien se puede utlizar funciones lambdas
        coleccion.forEach(elemento ->{
            System.out.println("Elemento = "+elemento);
        });
    }
}