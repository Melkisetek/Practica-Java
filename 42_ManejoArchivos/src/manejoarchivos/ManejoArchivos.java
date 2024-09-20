package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo); //Clase File crear un nuevo objeto para que se cree el archivo en disco duro.
        try {
            PrintWriter salida = new PrintWriter(archivo); //Escribir abrir archivo 
            salida.close(); //Se crea el archivo en disco
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {

            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido, int num) {
        File archivo = new File(nombreArchivo);
        try {
            // Abrir el achivo
            PrintWriter salida = new PrintWriter(archivo);
            // escribimos
            salida.println(contenido);
            salida.println(num);
            // cerrar
            salida.close();
            // mensaje
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException e) {

            e.printStackTrace(System.out);
        }
    }

    //Método para agregar más información en el archivo
    public static void anexarAchivo(String nombreArchivo, String contenido, int num) {
        File archivo = new File(nombreArchivo);
        try {
            // Abrir el achivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//objeto para anexar informacióm
            // escribimos
            salida.println(contenido);
            salida.println(num);
            // cerrar
            salida.close();
           
            // mensaje
            System.out.println("Se ha anexado informacion al archivo");
        } catch (FileNotFoundException e) {

            e.printStackTrace(System.out);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            try {
                // var, va se el tipo de la clase que esta al lado derecho
                var entrada = new BufferedReader(new FileReader(archivo));//FileReader no lee lineas completas, BufferedReader si lee lineas completas.
                var lectura = entrada.readLine(); // reaLine() para leer lineas completas
                // para leer todas las linea, vamos utilizar un ciclo while
                while (lectura != null /*la variable lectura sea diferente de null */) {
                    System.out.println("Lectura = " + lectura);
                    lectura = entrada.readLine();// se repite el ciclo completo
                }
                entrada.close();//para cerrar el flujo

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace(System.out);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace(System.out);
            }
        } else {
            System.out.println("Archivo no encontrado");
        }

    }
}