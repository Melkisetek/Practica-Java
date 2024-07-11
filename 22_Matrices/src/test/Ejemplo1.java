package test;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        String nombres [][] = new String[2][2];

        Scanner tecledo = new Scanner(System.in);
        //Utilizando consola
        for(int ren = 0; ren<nombres.length;ren++){ //filas 
            for(int col = 0; col<nombres[ren].length;col++){ //columnas
                System.out.println("Ingres Nombres: ");
                nombres [ren] [col] = tecledo.nextLine(); 
                System.out.println("Nombres: "+ren+"-"+col+": "+nombres[ren][col]); //imprimir
            }
        }
    }
}
