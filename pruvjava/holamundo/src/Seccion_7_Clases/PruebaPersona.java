
package Seccion_7_Clases;


public class PruebaPersona {
    public static void main(String[] args) { //psvm+tab: para escribir de manera rapida 
        ClasesPersonas persona1;
        persona1 = new ClasesPersonas();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        ClasesPersonas persona2 = new ClasesPersonas();
        
        System.out.println("Persona1 = "+persona1); //Ya que los valores son diferentes cada valor
        System.out.println("Persona2 = "+persona2);
        persona2.desplegarInformacion();
        
        persona2.nombre = "Karla";
        persona2.apellido = "Apellido";
        persona2.desplegarInformacion();
    }
    
}
