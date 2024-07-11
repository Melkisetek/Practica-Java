public class OperadoresCondiccionales {
    public static void main(String[] args) {
        var a=8;
        var valorMinimo=0;
        var valorMaximo=10;

        var resultado=a>=valorMinimo && a<=valorMaximo;

        if(resultado){
            System.out.println("Dentro del rango");
        }
        else{
            System.out.println("Fuera del rango");
        }

        //||=O
        var vaciones=true;
        var diaDescanso=false;
        //el operador or, si uno es verdadero "aunque el otro false" va ser vardadero todo.
        if(vaciones || diaDescanso){
            System.out.println("Tenemos dia libre");
        }
        else{
            System.out.println("Estamos ocupado");
        }
    }
}
