public class sentenciaSwitch {
    public static void main(String[] args) {
        int numero=8;
        String numeroTexto="Numero no encontrado";

        /*switch(numero){
            case 1:{
                numeroTexto="Numero Uno";
                break;
            }
            case 2:{
                numeroTexto="Numero Dos";
                break;
            }
            case 3:{
                numeroTexto="Numero Tres";
                break;
                
            }
            /*default:{
                System.out.println("Error desconocido");
            } 
            
        }*/

        /*System.out.println("El numero es: "+numeroTexto); */

        //Eje Estacion del año con switch
        switch(numero){
            case 1: case 2: case 12:{
                numeroTexto="Invierno";
                break;
            }
            case 3: case 4: case 5:{
                numeroTexto="Primavera";
                break;
            }
            case 6: case 7: case 8:{
                numeroTexto="Verano";
                break;
            }
            case 9: case 10: case 11:{
                numeroTexto="Otonio";
                break;
            }

        }

        System.out.println("La estacion es: "+numeroTexto);

    }
}
