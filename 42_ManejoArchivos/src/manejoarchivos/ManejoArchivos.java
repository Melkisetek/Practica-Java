package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {

            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            // Abrir el achivo
            PrintWriter salida = new PrintWriter(archivo);
            // escribimos
            salida.println(contenido);
            // cerrar
            salida.close();
            // mensaje
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException e) {

            e.printStackTrace(System.out);
        }
    }

    public static void anexarAchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            // Abrir el achivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            // escribimos
            salida.println(contenido);
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
                var entrada = new BufferedReader(new FileReader(archivo));
                var lectura = entrada.readLine(); // Solo leer una linea
                // para leer todas las linea, vamos utilizar un ciclo while
                while (lectura != null) {
                    System.out.println("Lectura = " + lectura);
                    lectura = entrada.readLine();// se repite el ciclo completo
                }
                entrada.close();

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