package test;
import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
   //instance of preguntar de que tipo esta haciendo referencia cierta variable. 

        Empleado empleado1 = new Empleado("Marvin", 86584);

        empleado1 = new Gerente("Ruth", 7473.89, "Derecho");
       
        determinarTipo(empleado1);
    }

    public static void determinarTipo(Empleado empleado){
      //Preguntamos en las clases en menos especificos a más especificos. 
            if(empleado instanceof Gerente){ //Si la variable empleado, esta apuntando a un objeto de tipo gerente
              System.out.println("Es de tipo gerente");
              Gerente gerente = (Gerente)empleado;
              System.out.println("gerente = "+gerente.getDepartamento());
            }
            else if(empleado instanceof Empleado){ //empleado es de tipo empleado, si es
              System.out.println("Es de tipo Empleado");
            }
            else if(empleado instanceof Object){
              System.out.println("Es de tipo Object");
            }
        }
}
