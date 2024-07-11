import java.util.Scanner;
import java.util.logging.ConsoleHandler;
public class ImprimirNumMayor {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner consola=new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        numero1=Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2: ");
        numero2=Integer.parseInt(consola.nextLine());
        System.out.println("El numero mayor es: ");
        System.out.println(numero1>numero2? numero1:numero2);

    }
}
