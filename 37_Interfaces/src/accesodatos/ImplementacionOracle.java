package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void inserta() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
       System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eleminar() {
       System.out.println("Eliminar desde Oracle");
    }

}