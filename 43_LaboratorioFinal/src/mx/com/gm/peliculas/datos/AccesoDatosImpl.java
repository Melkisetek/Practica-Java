package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

/*
     * Tenemos que cumplir con todos esos métodos, tal cual se definio en
     * IAccesoDatos
     * cumplir con los método definidos en la interface.
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override // Se le conoce como implementacion.
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    // Método listar peliculas
    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al lista peliculas" + ex.getMessage());//lanzamos propia excepcion
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al lista peliculas" + ex.getMessage());
        }
        return peliculas;
    }

    // Método escribir
    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        // podemos usar var
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito información al archivo: " + pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas" + e.getMessage());
        }

    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int  indice = 1;
            while (linea != null) {
                //equalsIgnoreCase para que no afecte las diferencias de minusculas y mayusculas
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula "+linea+" encontrada en el indice "+indice;
                    break;
                }
                linea=entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas" + e.getMessage());
        }

        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear el archivo:"+e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        if(archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }

}
