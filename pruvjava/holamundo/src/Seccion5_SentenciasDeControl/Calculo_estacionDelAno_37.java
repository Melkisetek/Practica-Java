//37 Ejecicio: calculo con estacion del año 
package Seccion5_SentenciasDeControl;

import java.util.Scanner;


public class Calculo_estacionDelAno_37 {
    public static void main (String args[]){
        var mes=6;//asignar el numero de mes
        var estacion="Estacion desconocida";//Ya que tenemos este valor no hay necesidad de usar else.
        
        System.out.println("Introduce mes:");
        Scanner consola=new Scanner (System.in);
        mes=Integer.parseInt(consola.nextLine());
        
        if (mes==1 || mes==2 || mes==12){
            estacion="Invierno";
        }
        else if(mes ==3 ||mes==4 ||mes==5 ){
            estacion="Primavera";
        }
        else if(mes==6 || mes==7 || mes==8){
            estacion ="Verano";
        }
        else if(mes==9 || mes==10 ||mes==11){
            estacion="Otoño";
        }
        
        System.out.println("estacion = " + estacion);
    }
    
}
