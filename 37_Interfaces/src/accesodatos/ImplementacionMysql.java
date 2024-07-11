package accesodatos;

public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void inserta() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eleminar() {
        System.out.println("Eliminar desde Mysql");
    }

}
