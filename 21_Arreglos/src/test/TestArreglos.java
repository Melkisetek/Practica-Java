package test;

public class TestArreglos {
    public static void main(String[] args) {
        //sintaxis para crear un arreglo
        int edades[] = new int[4];
        System.out.println("edades = "+edades);

        //modificando los indices []
        edades[0]=10;
        System.out.println("edades 0 = "+edades[0]);

        /*edades[1]=6;
        System.out.println("edades 1 = "+edades[1]);
        edades[2]=13;
        System.out.println("edades 2 = "+edades[2]);

        edades[3]=12;
        System.out.println("Valor 3: "+edades[3]); */

        //usando for para realizar un iteracion
        for(int i=0;i<edades.length;++i){
            System.out.println("edad elemento: "+i+": "+edades[i]);
        }
        

        //Otra forma de definir un arreglo. Sintaxis resumida
        String frutas[]={"Naranja", "Plátano", "Uva"};
        for (int i=0;i<frutas.length;++i){
            System.out.println("frutas = "+frutas[i]);
        }

        //Podemos usar un arreglo con diferentes tipos de datos, usar Object.
        Object objetos[]=new Object[5];
        objetos[0]=3;
        objetos[1]=20F;
        objetos[2]="Hola";
        objetos[3]=false;
        objetos[4]='A';

        for(int i=0;i<objetos.length;++i){
            System.out.println("objetos = "+objetos[i]);
        }



    }
}

