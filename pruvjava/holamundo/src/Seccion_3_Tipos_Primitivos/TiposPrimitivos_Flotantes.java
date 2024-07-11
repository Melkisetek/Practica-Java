
package Seccion_3_Tipos_Primitivos;

//18.Ejericio: Tipos primitivos tipos flotantes
public class TiposPrimitivos_Flotantes {
    public static void main(String args[]){
        /*
            Tipos primitivos de tipo flotante: float y double
        */
        //float numeroFloat=(float)10.0;
        float numeroFloat=(float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: "+Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: "+Float.MAX_VALUE);
        
        //double
        System.out.println("");
        double numeroDouble=10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: "+Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: "+Double.MAX_VALUE);
        
    }
}
 