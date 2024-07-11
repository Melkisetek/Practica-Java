package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        // datos.inserta();
        imprimir(datos);

        // para llamar oracle podemos reutilzar el datos.
        datos = new ImplementacionOracle();
        // datos.inserta();
        imprimir(datos);

    }

    // realizando varios usos
    public static void imprimir(IAccesoDatos datos) {
        datos.actualizar();
    }
}