package test;
import genericos.ClaseGenerica;;
public class TestGenerics {
    public static void main(String[] args) {
       ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();

        //podemos utlizar cualquier clase de tipo Object
        //Creamos un nuevo objeto tipo String
        ClaseGenerica<String> objetoString = new ClaseGenerica<String>("Menk");
        objetoString.obtenerTipo();
    }
}
