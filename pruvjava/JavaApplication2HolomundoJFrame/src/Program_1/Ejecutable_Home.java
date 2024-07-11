
package Program_1;

import ProyectoBase.Menu_Home;
import BaseDatos.lecturaArchivo;


public class Ejecutable_Home {


    public static void main(String[] args) {
        new Menu_Home().setVisible(true);
        lecturaArchivo leer = new lecturaArchivo();
        leer.leerArchivo();
    }
    
   
}
