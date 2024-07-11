import javax.print.attribute.SupportedValuesAttribute;

public class casa{
    public static void main(String[] args) {
        int a=4,b=3;
        
        
        /*
        var resultado=a+b; 
        System.out.println("El resultado: "+resultado);

        resultado=a-b;
        System.out.println("El resultado resta: "+resultado);

        resultado=a*b;
        System.out.println("La multiplicación: "+resultado);

        if(a%2==0){
            System.out.println("es un numero par");
        }
        else{
            System.out.println("Es un numero impar");
        }
        */

       /*  a+=1;
        System.out.println("a=Suma "+a);

        a-=1;
        System.out.println("a=Resta "+a);

        a*=2;
        System.out.println("a=Multiplicacion "+a);

        a/=2;
        System.out.println("a=Division "+a);

        a%=2;
        System.out.println("a=Modulo "+a);
        menk();
        */
        //Operadores de igualdad y relaciones en java
        var c=(a==b);
        System.out.println("c= "+c);
        var d=a!=b;
        System.out.println("d= "+d);

        String cadena="Hola";
        String cadena2="menk";
        var f=cadena.equals(cadena2); //compara el contenido de las cadenas si, son lo mismo.
        System.out.println("Comparar= "+f);
        
        var g=a>=b;
        System.out.println("g= "+g);

        if(a%2==0){
            System.out.println("Es un numero par");
        }
        else{
            System.out.println("Es un numero impar");
        }

        int m=18;
        int n=25;

        if(m>=n){
            System.out.println("Eres mayor de Edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

    }

    static void menk(){
        int e=3;
        int f=++e;
    
        System.out.println("Valor e="+e);
        System.out.println("valor f="+f);
    }
} 


