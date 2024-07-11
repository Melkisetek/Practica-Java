package mx.com.gm.peliculas.excepciones;
//extendemos de la clase Exception
public class AccesoDatosEx extends Exception{
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
}