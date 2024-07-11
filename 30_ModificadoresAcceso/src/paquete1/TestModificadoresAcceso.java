package paquete1;

public class TestModificadoresAcceso{
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("public");
        clase1.setAtributoPrivado("Cambio de valor atributo");
        System.out.println("clase 1 = "+clase1.getAtributoPrivado());
        
       /* clase1.atributoDefault = "Modificación atributo default";
        System.out.println("Clase1 = "+clase1.atributoDefault);
        clase1.metodoDefault(); */

        
    }
}