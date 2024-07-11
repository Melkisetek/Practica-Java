package test;
import java.util.Date;
import domain.Cliente;

public class TestHerencia{
    public static void main(String[] args) {
      /*Empleado empleado1=new Empleado("Mariel", 3500.00);
      System.out.println("Empleado1 = "+empleado1); */

      Cliente cliente1 = new Cliente(new Date(), true, "Mario", 'M', 25, "Guatemala, Chimaltenango");
      System.out.println("cliente1 = "+cliente1);

      
    }
}
