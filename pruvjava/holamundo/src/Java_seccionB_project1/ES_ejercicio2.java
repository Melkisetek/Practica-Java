/*
Chimaltenango, 16-07-2022
Programador: Melquisedec Ordoñez
Ejemplo 2, Estructura Secuencial
*/
package Java_seccionB_project1;

public class ES_ejercicio2 {
    public static void main(String args[]){
        System.out.println("-----------------------------------------");
        System.out.println("AREAS Y PERIMETROS FIGURAS GEOMETRICAS");
        System.out.println("-----------------------------------------");
        //Area y perimetro del rectangulo
        //Declaracion variables locales
        
        //Área y perimetro del rectangulo
        System.out.println("AREA Y PERIMETRO DEL RECTANGULO");
        float base=15;
        float altura=7;
        double area=0;
        double perimetro=0;
        var lado=7.7;
        area=base*altura;
        System.out.println("\"b=15, h=7\"");
        System.out.println("\tArea del rectangulo es: "+area+"^2");
        
        perimetro=base*base+altura*altura;
        System.out.println("\tEl perímetro del rectangulo es: "+perimetro);
        
        //Área y perímetro de un circulo
        System.out.println("AREA DE UN CIRCULO");
        var radio = 40;
        area=Math.PI*radio*radio;
        System.out.println("\"R=40\"");
        System.out.println("\tArea del circulo es: "+area+"^2");
        perimetro=2*Math.PI*radio;
        System.out.println("\tPerímetro del circulo es: "+perimetro);
        
        //Área y perímetro del cuadrado
        System.out.println("ÁREA Y PERIMETRO DEL CUADRADO");
        base=10;
        area=Math.pow(base,2);
        System.out.println("\"L1=10, L2=10\"");
        System.out.println("\tÁrea del cuadrado es: "+area+"^2");
        perimetro=(4*base);
        System.out.println("\tEl perímetro del cuadrado es: "+perimetro);
        
        //Área y perímetro de un triángulo
        System.out.println("ÁREA Y PERIMETRO DE UN TRIANGULO");
        altura=5;
        base=5;
        perimetro=altura+base+lado;
        System.out.println("\"b=5, h=5, l=7.7\"");
        System.out.println("\tPerímetro del triangulo es: "+perimetro);
        area=(altura*base)/2;
        System.out.println("\tÁrea del triangulo es: "+area+"^2");
        
        //Teorema de Pitágoras
        System.out.println("TRIANGULO RECTANGULO");
         base=15;
         altura=8;
         lado=Math.pow(altura,2)+Math.pow(base,2);
         lado=Math.sqrt(lado);
         System.out.println("\"b=15, a=8, c=?\"");
         System.out.println("\tResultado de hipotenusa es: "+lado);
         
         
        
    }
    
}
