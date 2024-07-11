
package Seccion_8_MetodosEnJava;


public class PruebaAritmetica {
    public static void main(String[] args) {
        aritmetica aritmetica1= new aritmetica();
        aritmetica1.a=3;
        aritmetica1.b=2;
        
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
        resultado=aritmetica1.sumarConArgumentos(8,5);
        System.out.println("Resultado usando argumentos = " + resultado);
          
    }
    
        
}
