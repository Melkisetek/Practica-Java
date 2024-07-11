package AlcanceDeVariable;

public class AlcanceDeVariables{
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int resultado=a+b;
        System.out.println("La suma es = "+resultado);


        metodo();
        
    }

    public static void metodo(){
        //La variable a esta fuera del alcance donde fue definida.
        //a=2;

        System.out.println("Otro metodo");
    }
}