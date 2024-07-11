public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        //Podemos obtener más acceso como sus metodos, atributos
        /*
         * int - Integer
         * long - Long
         * float - Float
         * double - Double
         */

         //Autoboxing
         Integer entero = 10;
         System.out.println("entero = "+entero);
         System.out.println("entero = "+entero.doubleValue());
        //Unboxing
         int entero2 = entero;
         System.out.println("entero2 = "+ entero2);
    }
}
