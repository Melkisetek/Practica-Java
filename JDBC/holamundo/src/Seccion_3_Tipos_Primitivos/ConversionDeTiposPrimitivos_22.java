//22. Convesion de tipos primitivos en java-Parte 1
package Seccion_3_Tipos_Primitivos;

import java.util.Scanner;


public class ConversionDeTiposPrimitivos_22 {
    public static void main (String args[]){
       //convertir tipo String a un tipo int
       var edad=Integer.parseInt("20");
       //var edad="20";
        System.out.println("edad = " + (edad+1));
        
        //Convertir tipo String a un tipo souble
        var valorPI=Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + valorPI);
        
        //Ejemplo: Pedir un valor
        var consola =new Scanner (System.in);
//        System.out.println("Proporciona tu edad");
//        edad=Integer.parseInt(consola.nextLine());
//        System.out.println("Edad = " + edad);
        
        //Conversion de tipos primtivos-parte 2
        //String a tipo char
        var caracter = "hola".charAt(2);
        System.out.println("Caracter ="+caracter);
        //imprimir solo un caracter 
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Caracter= "+caracter);
        
    }
    

}
