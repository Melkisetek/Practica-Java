//Concatenación de variables en Java

public class Concatenacion_Variables {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";   

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);//Atajo "soutv",para imprimir 
        
        var num1=3;
        var num2=4;
        
        System.out.println(num1+num2); //Se realiza la suma de numeros
        System.out.println(num1+num2+usuario);//Evalua de izq a der, realiza suma
        System.out.println(usuario+num1+num2);//contexto cadena, todo es una cadena
        System.out.println(usuario+(num1+num2));//uso de parentesis modifican la prioridad en la evaluacion
    }
}
