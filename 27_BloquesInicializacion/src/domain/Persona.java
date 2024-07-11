package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

//Bloque de inicializion estatico-Se ejecuta antes del constructor de la clase.
    static{
        System.out.println("Ejecucion de bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona=10; //No es estatica no puede ser referenciada desde un contexto estatico.
    }

//Ejecucion de bloque No estatico-Se ejecuta antes del constructor de la clase.
{
    System.out.println("Ejecución bloque NO estatico");
    this.idPersona=Persona.contadorPersonas++;
}

public Persona(){
    System.out.println("Ejecución del constructor");
}

public int getIdPersona() {
    return this.idPersona;
}

@Override
public String toString() {
    return "Persona [idPersona=" + idPersona + "]";
}



}