 package operaciones;

 public class PruebaAritmetica{
        //psvm atajo para crea main.
       public static void main(String[] args) {
        Aritmetica aritmetica1=new Aritmetica();
        
        aritmetica1.a=4;
        aritmetica1.b=4; 
 
        aritmetica1.sumar();


        int resultado=aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la prueba = "+resultado);
        
        resultado=aritmetica1.sumarConArgumentos(8, 7);
        System.out.println("Resultado usando argumentos = "+resultado);
        
        

      }
 }