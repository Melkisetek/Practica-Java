public class operadorTernario{
    public static void main(String[] args) {
        var resultado = (2>3) ? "verdadero":"falso";

        System.out.println("Resultado: "+resultado);

        var numero=8;
        resultado=(numero%2==0) ? "numero par":"numero impar";
        System.out.println("El numero es: "+resultado);
    }
} 