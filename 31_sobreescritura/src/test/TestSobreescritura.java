package test;
import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
      /*-----------Aplicación de sobreescritura------------ */
        //Gerente gerente1 = new Gerente("Luis", 5865.90, "Sistemas");
        //System.out.println("Gerente1: "+gerente1.obtenerDetalles());
    
        //-----------Aplicando el concepto de polimorfismo---------

        Empleado empleado1 = new Empleado("Marvin", 86584);
        //System.out.println("empleado1 = "+empleado1.obtenerDetalles());

          imprimir(empleado1); //referencia tipo padre

        Gerente gerente1 = new Gerente("Ruth", 7473.89, "Derecho");
        //System.out.println("Gerente1 = "+gerente1.obtenerDetalles());

        //Polimorfismo: multiples formas en tiempo de ejecución 
        imprimir(gerente1); //referencia tipo hijo
      

    }

    public static void imprimir(Empleado empleado){
            System.out.println("empleado = "+empleado.obtenerDetalles());
        }
}
