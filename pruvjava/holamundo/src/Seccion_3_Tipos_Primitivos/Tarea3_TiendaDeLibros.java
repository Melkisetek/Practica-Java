//#Tarea
package Seccion_3_Tipos_Primitivos;

import java.util.Scanner;

public class Tarea3_TiendaDeLibros {
    public static void main (String args[]){
        String Nombre;
        int ID;
        double Precio;
        boolean envioGratuito=true;
        var consola=new Scanner (System.in);
        System.out.println("\tTienda de Libros\n");
        System.out.println("Nombre de libro:");
        Nombre=consola.nextLine();
        System.out.println("ID:");
        ID=consola.nextInt();
        System.out.println("Precio:");
        Precio=consola.nextDouble();
        System.out.println("--------------------------------------");
        //Imprimir
        System.out.println("Titulo del Libro: "+Nombre+" #"+ID);
        System.out.println("Precio: "+"Q"+Precio);
        System.out.println("Tipo de envio: "+envioGratuito);
        
    }
    
}
