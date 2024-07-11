package test;

import domain.*;

public class TestConversionObjetos{
    public static void main(String[] args) {
        Empleado empleado;

        empleado=new Escritor("Juan", 3838, TipoEscritura.CLASICO);
       // System.out.println("\n empleado = "+empleado+"\n");

        //System.out.println(empleado.obtenerDetalles());


        //Tenemos que hacer una conversión de objetos. Downcasting
        //((Escritor)empleado).getTipoEscritura();
        //segunda forma de Donwcasting
        Escritor escritor=(Escritor)empleado;
        //escritor.getTipoEscritura();

        //upcasting-Funciona sin una conversión.
        Empleado empleado2=escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
}