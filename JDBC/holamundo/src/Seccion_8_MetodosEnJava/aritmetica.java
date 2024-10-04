
package Seccion_8_MetodosEnJava;


public class aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacío
    public aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    public aritmetica(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando el connstructor con arg");
    }
    
    
    //Metodo
    public void sumar(){
        int resultado = a+b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
//        int resultado = a+b;
//        return resultado
        
        return a+b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
       this.a=arg1;
       /*El uso de this es opcional, sirve para detectar que es un metodo de nuestra la clase
       Y no un metodo independiente de nuestra clase.
       */
       this.b=arg2;
        
        //return a+b;
        return this.sumarConRetorno();
       
        
    }
}
