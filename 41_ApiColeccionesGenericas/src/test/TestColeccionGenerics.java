package test;
import java.util.*;
public class TestColeccionGenerics{
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); //Indicar el tipo de dato
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");

        String elemento = miLista.get(2);
        //System.out.println("Elemento indice = "+elemento);

        //imprimir(miLista);

        //for(Object elemento: miLista){
        //    System.out.println("elemento = "+elemento );
        //}

        Set<String> miSet = new HashSet<>(); //Indicar el tipo con la cual vamos a trabajar
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //imprimir(miSet); //Set no imprime en orden 

       //Map
       Map<String,String> miMapa = new HashMap<>(); //Indicar el tipo de dato para la llave y valor
       miMapa.put("Valor1", "Juan");
       miMapa.put("Valor2", "Orlando");
       miMapa.put("Valor3", "jiren");

       String elemento2 = miMapa.get("Valor1"); // muestra valor 
       System.out.println("elementoMapa = "+elemento2);

       //imprimir(miMapa.keySet());//imprimir llaves
       //imprimir(miMapa.values());//imprimir valores
       
    }

    public static void imprimir(Collection<String> coleccion){ //Indicar el tipo a iterar
        //for(Object elemento: coleccion){
        //    System.out.println("elemento = "+elemento);
        //}
        //Tambien se puede utlizar este forEach
        coleccion.forEach(elemento ->{
            System.out.println("Elemento = "+elemento);
        });
    }
}