package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    //Método
    public void sumar(){
        int resultado = a+b;
        System.out.println("resultado = "+resultado);
    }

    //Método que regresa un valor
    public int sumarConRetorno(){
        //Solución1
        int resultado = a+b;
        return resultado;

        //Solución 2
        //return a+b;
    }

    //Método con argumentos
    public int sumarConArgumento(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return a+b;
    }

}