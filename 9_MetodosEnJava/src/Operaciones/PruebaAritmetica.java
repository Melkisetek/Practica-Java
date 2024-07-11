package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=3;
        aritmetica1.b=4;
        aritmetica1.sumar();

        //Con retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado con retorno = "+resultado);

        //Usando paremetros
        resultado = aritmetica1.sumarConArgumento(20, 15);
        System.out.println("Resultado usando argumentos = "+resultado);
    }
}
