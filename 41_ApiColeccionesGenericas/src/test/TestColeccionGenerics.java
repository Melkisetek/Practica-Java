package test;
import java.util.*;
public class TestColeccionGenerics{
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");

        //String elemento = miLista.get(2);
        //System.out.println("Elemento indice = "+elemento);

        //imprimir(miLista);

        //for(Object elemento: miLista){
        //    System.out.println("elemento = "+elemento );
        //}

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //imprimir(miSet); //Set no imprime en orden 

       //Map
       Map<String,String> miMapa = new HashMap<>();
       miMapa.put("Valor1", "Juan");
       miMapa.put("Valor2", "Orlando");
       miMapa.put("Valor3", "jiren");

       String elemento = miMapa.get("Valor3");
       System.out.println("elementoMapa = "+elemento);

       //imprimir(miMapa.keySet());//imprimir llaves
       //imprimir(miMapa.values());//imprimir valores
       
    }

    public static void imprimir(Collection<String> coleccion){
        //for(Object elemento: coleccion){
        //    System.out.println("elemento = "+elemento);
        //}
        //Tambien se puede utlizar este forEach
        coleccion.forEach(elemento ->{
            System.out.println("Elemento = "+elemento);
        });
    }
}