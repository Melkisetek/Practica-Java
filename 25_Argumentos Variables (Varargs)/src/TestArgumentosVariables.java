public class TestArgumentosVariables {
    //Parametros Variables en java: varargs
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,12,90);
    }

    //El argumento variable, debe ser el ultimo argumentos en agregar en el método
    public static void imprimirNumeros(int... numeros){
        int numero;
        for(int i=0;i<numeros.length;i++){
            numero=numeros[i];
            System.out.println("Imprimir numeros: "+numero);
        }
    }
}
