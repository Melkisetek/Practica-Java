
//Crea un programa para saludar desde java
public class Variables {
    public static void main(String args[]){
        int numEntera = 10;
        System.out.println(numEntera);
        
        //Modificamos el valor de la variable
        numEntera=5;
        //Escribir sout luego presionar, tabulador para atajo println
        System.out.println(numEntera);
        
        String variableCadena = "Hola";
        System.out.println(variableCadena); //Ctrl+Espacio para mostrar variables
       
        //modificar el valor de la variable 
        variableCadena="Adios";
        System.out.println(variableCadena);
        
        //var - Inferencia de tipos en Java
        var varVariable=16;
        System.out.println(varVariable);
        
        //usar var para tipo cadena
        var miVariable2="Texto con var.";
        System.out.println("miVariable2 = "+miVariable2+" "+variableCadena);
        
    }
    
}
