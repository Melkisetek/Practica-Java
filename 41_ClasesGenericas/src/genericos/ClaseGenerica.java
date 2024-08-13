package genericos;

public class ClaseGenerica<T>{
    T objeto;

    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }

    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName()); //mandar a imprimir el tipo que finalmente se utilizo para crear una instancia de esta clase
    }

}