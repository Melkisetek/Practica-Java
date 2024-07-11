package test;
import domain.Persona;
public class TestMatrices {
    public static void main(String[] args) {
        /*En el primer corchete se define el reglon, el 
        segundo la columna. 
        */
        int edades[][] = new int[3][2];

        edades [0][0]=5;
        edades [0][1]=7;
        edades [1][0]=8;
        edades [1][1]=4;
        edades [2][0]=9;
        edades [2][1]=10;
       
        /* System.out.println("edades 0-0 = "+edades[0][0]);
        System.out.println("edades 0-1 ="+edades[0][1]);
        System.out.println("edades 1-0 ="+edades[1][0]);
        System.out.println("edades 1-1 ="+edades[1][1]); 
        System.out.println("edades 2-0 ="+edades[2][0]);
        System.out.println("edades 2-1 ="+edades[2][1]); */

        for(int ren=0;ren<edades.length;ren++){
            for(int col=0;col<edades[ren].length;col++){
                System.out.println("edades = "+ren+"-"+col+": "+edades[ren][col]);
            }
        }

        //Sintaxis simplificada
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Uva"}};
        for(int ren = 0;ren<frutas.length;ren++){
            for(int col = 0;col<frutas[ren].length;col++){
                System.out.println("Nombres Frutas: "+ren+"-"+col+": "+frutas[ren][col]);
            }
        }
       
       
       
        imprimir(frutas);
        
        //Matriz usando objetos
        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Marcos");
        personas[0][1] = new Persona("Juan");
        personas[0][2] = new Persona("Samuel");
        personas[1][0] = new Persona("Raul");
        personas[1][1] = new Persona("Daniel");
        imprimir(personas);
    }
    //imprimir cualquier tipo de matriz de tipo object 
    public static void imprimir(Object matriz[][]){
        System.out.println("\n");
        for(int ren=0;ren<matriz.length;ren++){
            for(int col=0;col<matriz[ren].length;col++){
                System.out.println("Frutas = "+ren+"-"+col+": "+matriz[ren][col]);
            }
        }
    }
}
 