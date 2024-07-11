package test;
import static manejoarchivos.ManejoArchivos.*;
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo="C:\\Users\\Melquisedec\\Desktop\\Prueba.txt";
        //crearArchivo(nombreArchivo);

        //anexarAchivo(nombreArchivo,"Hola mundo desde Java SE 2");
        //anexarAchivo(nombreArchivo, "Aprendiendo el manejo de archivo");
        

        leerArchivo(nombreArchivo);
    } 
}
