//21 Tipos Primitivos tipo boolean
package Seccion_3_Tipos_Primitivos;

public class TiposPrimitivos_21_boolean {
    public static void main (String args[]){
        boolean varBoolean=true;
        System.out.println("VarBoolean="+ varBoolean);
        
        if (varBoolean){//Tambien varBoolean == true
            System.out.println("La bandera es veradera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
     
        //Ejemplo
        var edad=11;
        //var esAdulto =edad>=18;
        if (edad >=18){
            System.out.println("Eres mayor de edad");
        } 
        else {
            System.out.println("Eres menor de edad");
        }
        
    }
    
}
