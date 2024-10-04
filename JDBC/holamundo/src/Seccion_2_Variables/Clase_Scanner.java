
import java.util.Scanner;

public class Clase_Scanner {
    public static void main(String args[]){
        Scanner consola=new Scanner (System.in);
        System.out.println("Escribe tu nombre: ");
        var usuario=consola.nextLine();
        System.out.println("Usuario: "+ usuario);
        System.out.println("Escribe el titulo: ");
        var titulo=consola.nextLine();
        System.out.println("Resultado: "+titulo+" "+usuario);
    }
}
