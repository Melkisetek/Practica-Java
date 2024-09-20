package mx.com.gm.peliculas.servicio;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;




public class CatalogoPeliculasImp implements ICatalogoPeliculas {

    
    private final IAccesoDatos datos;
    
//Para iniciar la interfaz de IAccesoDatos
    public CatalogoPeliculasImp() {
        this.datos=new AccesoDatosImpl();
        
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar=datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado=null;
        try {
            resultado=this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso datos");
            e.printStackTrace(System.out);
        }
       if (resultado == null) {
         System.out.println("resultado = "+"No se ha encontrado la película");
       }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO); // Se borra
                datos.crear(NOMBRE_RECURSO); // Se crea
            }
            else{
                datos.crear(NOMBRE_RECURSO); // sí, no existe se crea.
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar catalogo de peliculas");
            e.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for(var pelicula: peliculas){
                System.out.println("pelicula = "+pelicula);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error  de acceso datos");
            e.printStackTrace(System.out);
        }

    }

}
