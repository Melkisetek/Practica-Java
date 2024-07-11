package AlcanceDeVariable.Laboratorio1;

public class Prueba {
    public static void main(String[] args) {
        //Objeto
        Caja caja1=new Caja();

        caja1.ancho=3;
        caja1.alto=2;
        caja1.profundo=6;
        int resultado=caja1.formulaVolumen();
        System.out.println("El volumen de la caja1 es: "+resultado);

        //objeto con los valores argumentos
        Caja caja2=new Caja(2, 4, 7);
        System.out.println("El volumen de la caja2 es: "+caja2.formulaVolumen());
        
        


    }

    
}

