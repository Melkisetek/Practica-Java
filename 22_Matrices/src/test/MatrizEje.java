package test;

import java.util.Scanner;

import domain.Persona;

public class MatrizEje {
    public static void main(String[] args) {
        int edades [][] = new int[2][2];
      Persona personas [] [] = new Persona[2][1];
  
        /*edades [0][0] = 19;
        edades [0][1] = 20;
        edades [1][0] = 21;

        System.out.println("Edades 0-0 = "+edades[0][0]);
        System.out.println("Edades 0-1 = "+edades[0][1]);
        System.out.println("Edades 1-0 = "+edades[1][0]);
        System.out.println("Edades 1-1 = "+edades[1][1]); */

        //Utilizando consola con objetos

        try (Scanner consola = new Scanner(System.in)) {
            for(int ren=0;ren<personas.length;++ren){
                for(int col=0;col<personas[ren].length;++col){
                     System.out.println("Ingrese Nombres: ");
                 personas[ren][col] = new Persona(consola.nextLine());  //Integer.parseInt(consola.nextLine());

                    System.out.println("Nombres ="+ren+"-"+col+": "+personas[ren][col]);   
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
