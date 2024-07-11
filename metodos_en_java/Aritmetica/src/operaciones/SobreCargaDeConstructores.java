package operaciones;

public class SobreCargaDeConstructores {
    public static void main(String[] args) {
        Aritmetica aritmetica1=new Aritmetica();
        System.out.println("aritmetica1 a:"+aritmetica1.a);
        System.out.println("aritmeti ca1 b:"+aritmetica1.b);

        Aritmetica aritmetica2=new Aritmetica(3,4);
        System.out.println("aritmetica2 a:"+aritmetica2.a);
        System.out.println("aritmetica2 b:"+aritmetica2.b);
    }
    
}
