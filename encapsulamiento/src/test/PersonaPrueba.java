package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias", 2500.00, false);
        //llamados toString para verificar el estado del objeto creado. más info. seccion 14
        System.out.println("persona1: "+persona1.toString());

        System.out.println("\npersona1 nombre: "+persona1.getNombre());
        //Hemos cambiado el nombre, anteriormente era "Matias" ahora "Luis miguel"
        persona1.setNombre("Luis miguel");
        System.out.println("persona1 nombre con cambio: "+persona1.getNombre());
        System.out.println("persona1 sueldo: "+persona1.getSueldo());
        System.out.println("persona1 eliminado: "+persona1.isEliminado());

        /*Ejercicio. crear un nuevo objeto definir el nombre, despues 
         * modifcar el nombre y mandarlos a imprimir
         */
        //nuevo objeto
        Persona persona2 = new Persona("Joel Ruiz", 5000.00, false);
        System.out.println("\npersona2 nombre: "+persona2.getNombre());
        persona2.setNombre("Lionel Andrez Messi cutti");
        System.out.println("persona2 con cambio de nombre: "+persona2.getNombre());
        System.out.println("persona2 sueldo: "+persona2.getSueldo());
        persona2.setSueldo(15000.00);
        System.out.println("persona2 con cambio de sueldo: "+persona2.getSueldo());
        System.out.println("persona2 eliminado: "+persona2.isEliminado());
        persona2.setEliminado(true);
        System.out.println("persona2 con cambio eliminado: "+persona2.isEliminado());
    }
}
