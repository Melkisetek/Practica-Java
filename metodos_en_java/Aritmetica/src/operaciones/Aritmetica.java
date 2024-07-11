package operaciones;

public class Aritmetica {
   // atributos de la clase
   int a;
   int b;

   //Constructor vacio
   public Aritmetica(){
      System.out.println("Ejecutando constructor");
   }

   //Contructro con argumentos
   public Aritmetica(int a, int b){
      System.out.println("ejecutando contructor con argumentos");
      this.a=a;
      this.b=b;
   }

   // metodo
   public void sumar() {
      int resultado = this.a + this.b;
      System.out.println("resultado = " + resultado);
   }

   // Declarando un metodo que regresa informacion.
   public int sumarConRetorno() {
      /*
       * int resultado=a+b;
       * return resultado;
       */

      return this.a + this.b;
   }

   public int sumarConArgumentos(int arg1, int arg2) {
      //this hace referencia ha una atributo de nuestra clase, y no ha una variable local.
      this.a = arg1;//El argumento a se asigna al atributo this.a
      this.b = arg2;

      return this.sumarConRetorno();
   }
}