package domain;
//clase hija 
public class Gerente extends Empleado {
    //ya no tiene subclase lo podemos dejar como privado.
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        //inicializamos la clase padre
        super(nombre, sueldo);
        //inicializamos el atributo
        this.departamento=departamento;
    }

    @Override //Opcional indica que se esta siendo sobreescrito el metodo desde la clase padre.
    //Para imprimir atributo de departamento, en el método obtenerDetalles
    public String obtenerDetalles(){
         return super.obtenerDetalles()+", departamento: "+this.departamento;
    }

}
