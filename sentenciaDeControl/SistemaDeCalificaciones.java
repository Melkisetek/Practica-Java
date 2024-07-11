import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        int numero=0;
        String mostrarNum="Valor desconocido";

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        numero=Integer.parseInt(consola.nextLine());

        if(numero>=9 && numero<10){
            mostrarNum="A";
        }
        else if(numero >=8 && numero<9){
            mostrarNum="B";
        }
        else if(numero>=7 && numero<8){
            mostrarNum="C";
        }
        else if(numero>=6 && numero<7){
            mostrarNum="D";
        }
        else if(numero>=0 && numero<6){
            mostrarNum="F";
        }

        System.out.println("Imprimir: "+mostrarNum);
    }
}
