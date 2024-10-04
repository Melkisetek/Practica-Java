package Seccion_3_Tipos_Primitivos;

public class TiposPrimitivos_Enteros {

    public static void main(String args[]) {
        /*
            tipos primitivos enteros: bytes, short, int, long
         */
        byte numeroByte = (byte) 129; //el valor de byte maximo positivo es 127
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

        //short
        System.out.println("");
        short numeroshort = (short) 32768;
        System.out.println("numeroshort =" + numeroshort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor Maximo short: " + Short.MAX_VALUE);

        //int
        System.out.println("");
        int numeroInt = (int) 2147483648L; //para obligar el tipo de dato int
        System.out.println("numeroInt= " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        //long
        System.out.println("");
        long numeroLong=10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de long: "+Long.MIN_VALUE);
        System.out.println("Valor maximo de long: "+Long.MAX_VALUE);
    }
}
