package Ejemplo;

import java.util.Scanner;

public class ImprimirConsola {
    public static void main(String[] args) {
        String nombres[] = new String[3];
        //int edades[] = new int[3];
        // imprimir en consola
        try (Scanner consola = new Scanner(System.in)) {
            for (int i = 0; i < nombres.length; ++i) {
                System.out.println("Ingrese Nombres: ");
                nombres[i] = consola.nextLine();
                System.out.println("Su nombre es: " + i + "= " + nombres[i]);
            }

            // Edades
            /*
             * for(int i=0;i<edades.length;++i){
             * System.out.println("Ingrese edades: ");
             * edades[i] = Integer.parseInt(consola.nextLine());
             * System.out.println("Edades de personas: "+i+"= "+edades[i]);
             * }
             */

            // utilizando la clase Object
            /*
             * Object objeto[] = new Object[3];
             * for(int i=0;i<objeto.length;++i){
             * System.out.println("Ingres datos: ");
             * objeto[i] = consola.nextLine();
             * System.out.println("Datos: "+i+"= "+objeto[i]);
             * }
             */
        }
    }
}
