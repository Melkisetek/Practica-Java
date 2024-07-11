public class TestArgsVariables2 {
    
    public static void main(String[] args) {
        variosParametros("Meddelin", 1,3,4,5);
        imprimirNumeros(2,12,1,34);
        imprimirNumeros(2,3);
        
    }

    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre= "+nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros){
        for(int i=0;i<numeros.length;i++){
            System.out.println("Elemento: "+numeros[i]);
        }
    }

}
