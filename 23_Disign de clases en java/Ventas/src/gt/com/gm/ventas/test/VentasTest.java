package gt.com.gm.ventas.test;

import gt.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1=new Producto("Camisa", 50.00);
        Producto producto2=new Producto("Pantalon", 130.00);


        Orden orden1=new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden(); 

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.mostrarOrden();
    }
}
