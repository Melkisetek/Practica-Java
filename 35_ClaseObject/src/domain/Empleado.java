package domain;

public class Empleado{
    protected String nombre;
    protected double sueldo;
//constructor con argumentos
    public Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    //metodo
    public String obtenerDetalles(){
        return "nombre: "+this.nombre+", sueldo: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }

    //hascode y equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false;
        return true;
    } 

    
}