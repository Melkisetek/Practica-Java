package testoperacion;
import operaciones.Operaciones;

public class TestOperacion {
    public static void main(String[] args) {
        int resultado=Operaciones.sumar(3, 6);
        System.out.println("resultado = "+resultado);

        double resultado2=Operaciones.sumar(5, 10);
        System.out.println("resultado2 = "+resultado2);

        var resultado3=Operaciones.sumar(4, 4L);
        System.out.println("resultado3 = "+resultado3);
    }
}
