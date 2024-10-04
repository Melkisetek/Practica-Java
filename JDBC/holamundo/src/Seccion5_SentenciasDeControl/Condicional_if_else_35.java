package Seccion5_SentenciasDeControl;

public class Condicional_if_else_35 {

    public static void main(String args[]){
    var condicion=true;//es un tipo boolean
    
    if (condicion){
        System.out.println("Condicion Verdadera");
        }
    else{
        System.out.println("Condicion falsa");
    }
     
    //Ejemplo: Convertir numeros a textos  
    var numero=3;
    var numeroTexto="Numero desconocido";
    
    if (numero==1){
        numeroTexto="Numero uno";
    }
    else if(numero==2){
        numeroTexto="Numero dos";
    }
    else if(numero==3){
        numeroTexto="Numero tres";
    }
    else if (numero==4){
    numeroTexto="Numero cuatro";
    }
    else {
    numeroTexto="Numero no encontrado";
    }
        System.out.println("numeroTexto ="+numeroTexto);
}    
}
