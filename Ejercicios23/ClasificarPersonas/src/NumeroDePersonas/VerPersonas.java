package NumeroDePersonas;

public class VerPersonas {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.setName("Carlos");
        System.out.println("Nombre: "+persona1.getName());
        
        persona1.setLastName("Esparta");
        System.out.println("Apellido: "+persona1.getLastName());

        persona1.setAge(23);
        System.out.println("edad: "+persona1.getAge());

        persona1.setMarried(true);

        persona1.setIdentityDocumentNumber("45454546546");
        System.out.println("Número de edentidad: "+persona1.valueIdentityDocumentNumber());
        
    }
}