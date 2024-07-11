package domain;

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
    public String obtenerDetalles(){
         return super.obtenerDetalles()+", departamento: "+this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

}
