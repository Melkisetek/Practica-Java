//20.Ejercicio: Tipos primitivos tipo char
package Seccion_3_Tipos_Primitivos;

public class TiposPrimitivoTipo_Char {
    public static void main(String args[]){
        char miCaracter='a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar='\u0021'; //Simbolos Unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal=33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo='!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //var
        var varChar1='\u0021';
        System.out.println("VarChar1 = "+varChar1);
        var varCharDecimal1=(char)33;//Podemos hacer una conversion
        System.out.println("varCharDecimal = " + varCharDecimal1);
        var varCharSimbolo1='!';
        System.out.println("varCharSimbolo = " + varCharSimbolo1);
    }
    
}
