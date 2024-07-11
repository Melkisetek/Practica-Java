import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        /*int numero=3;
        String numeroText="Numero no encontrado";

        if(numero==1){
            numeroText="Numero uno";
        }
        else if(numero==2){
            numeroText="Numero dos";
        }
        else if(numero==3){
            numeroText="Numero tres";
        }
       /* else{
            System.out.println("Error numero no encontrado.");
        } */
        
        /*System.out.println(numeroText);
        */
        
        //Eje Estacion del año usando la consola Scanner.
       int mes=10;
       String estacion="Estacion desconocida";
       Scanner consola = new Scanner(System.in);
       System.out.println("Ingrese una estacion: ");
       mes=Integer.parseInt(consola.nextLine());

       if(mes==1 || mes==2 || mes==12){
        estacion="Invierno";
       }
       else if(mes==3 || mes==4 || mes==5){
        estacion="Primavera";
       }
       else if(mes==6 || mes==7 || mes==8){
        estacion="Verano";
       }
       else if(mes==9 || mes==10 || mes==11){
        estacion="Otonio";
       }

       System.out.println("La estacion es: "+estacion);

    }
}
