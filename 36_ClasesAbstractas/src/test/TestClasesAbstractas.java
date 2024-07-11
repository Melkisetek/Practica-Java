package test;
import domain.*;
public class TestClasesAbstractas{
    public static void main(String[] args) {
        //No podemos utilizar el objeto de la clase padre, utilizamos de la clase hija.
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();


    }
}