package test;
import domain.Persona;
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Marvin");
        persona.setApellido("Rios");
        System.out.println("Persona = "+persona);
        System.out.println("Nombre1 = "+persona.getNombre());
        System.out.println("Apellido = "+persona.getApellido());
    }

}
