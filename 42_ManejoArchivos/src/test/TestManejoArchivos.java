package test;
import static manejoarchivos.ManejoArchivos.*;
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo="C:\\Users\\Melquisedec\\Documents\\Cursos\\java\\42_ManejoArchivos\\Prueba.txt";
        //crearArchivo(nombreArchivo);

        anexarAchivo(nombreArchivo,"Hola mundo desde Java SE 2", 3+1);
        //anexarAchivo(nombreArchivo, "Aprendiendo el manejo de archivo");
        

        leerArchivo(nombreArchivo);
    } 
}
