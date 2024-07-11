//Tarea 4:Rectángulo
import java.util.Scanner;
public class Tarea4{
    public static void main(String[] args) {
        //Calcular el área y périmetro de un Rectángulo
        int alto=4;
        int ancho=6;

        int area=(alto*ancho);  
        System.out.println("El area del rectangulo: "+area);

        int perimetro=(alto+ancho)*2;
        System.out.println("El perimetro es: "+perimetro);

        //Utilizando la consola para el area
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese el alto: ");
        alto=Integer.parseInt(consola.nextLine());
        System.out.println("Alto="+alto);
        
        System.out.println("Ingerese el ancho: ");
        ancho=Integer.parseInt(consola.nextLine());
        System.out.println("Ancho="+ancho);
        System.out.println("El Area del rectangulo es: "+(alto*ancho));
        System.out.println("El perimetro es: "+((alto+ancho)*2));



    }
}