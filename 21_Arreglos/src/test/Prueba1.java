package test;

public class Prueba1 {
    public static void main(String[] args) {

        //Arreglo tipo primitivo
        int edad[] = new int[3];
        edad [0]=3;
        System.out.println("Edad = "+edad[0]);

        edad [1]=10;
        System.out.println("Edad 1 = "+ edad[1]);
        edad [2] = 11;
        System.out.println("Edad 2 = "+edad[2]);
        

        //Controlar valor con ciclo for
        for(int i = 0;i<edad.length;i++){
            System.out.println("Lista Edades = "+i+": "+edad[i]);
        }
    }
}
