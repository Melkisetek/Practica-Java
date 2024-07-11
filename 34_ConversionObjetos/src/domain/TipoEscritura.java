package domain;
//vamos utilizar  enum (enumeracion) para poner en practica el concepto. 
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

}
