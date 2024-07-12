package excepciones;
//extendemos de algunas de las excepciones
public class OperacionExcepcion extends Exception{
    //Crear constructor para propagar el mensaje
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}   