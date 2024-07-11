package test;
import java.util.*;
public class TestColeccion{
    public static void main(String[] args) {
        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");

        //imprimir(miLista);

        //for(Object elemento: miLista){
        //    System.out.println("elemento = "+elemento );
        //}

        Set miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

       // imprimir(miSet); //Set no imprime en orden 

       //Map
       Map miMapa = new HashMap<>();
       miMapa.put("Valor1", "Juan");
       miMapa.put("Valor2", "Orlando");
       miMapa.put("Valor3", "jiren");

       //String elemento = (String) miMapa.get("Valor1");
       //System.out.println("elemento = "+elemento);

       imprimir(miMapa.keySet());//imprimir llaves
       imprimir(miMapa.values());//imprimir valores
       
    }

    public static void imprimir(Collection coleccion){
        //for(Object elemento: coleccion){
        //    System.out.println("elemento = "+elemento);
        //}
        //Tambien se puede utlizar este forEach
        coleccion.forEach(elemento ->{
            System.out.println("Elemento = "+elemento);
        });
    }
}