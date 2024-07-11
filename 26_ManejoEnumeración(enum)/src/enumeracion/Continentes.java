package enumeracion;

public enum Continentes{
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    //Creamos un atributo privado y final.
    private final int paises;

    //Creamos un constructor
    Continentes(int paises){
        this.paises=paises;
    }
    //Método get para que regrese valores
    public int getPaises(){
        return this.paises;
    }
}
