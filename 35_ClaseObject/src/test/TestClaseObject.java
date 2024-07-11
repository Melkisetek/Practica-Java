package test;
import domain.*;
import domain.Empleado;

public class TestClaseObject{
    public static void main(String[] args) {
        //new crea nuera referencia en memoria
        Empleado empleado1=new Empleado("luis", 5000);
        Empleado empleado2=new Empleado("Luis", 5000);
        
        if(empleado1==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        //comparar el contenido de los objetos, más no referencia en memoria
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }

        //hascode
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("El valor de hascode es igual");
        }
        else{
            System.out.println("El valor de hascode es distinto");
        }
    }
}