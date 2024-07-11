
package baseumg_Empleados;
//import baseumg.personaDAO2;
import ModelsBase.empleadoclass;;
import java.util.List;

public class umgManejoEmpleados {
    public static void main(String[] args) {
        personaDAO2 personaDao = new personaDAO2();
        //Insertando un nuevo objeto de tipo persona
        
//        empleadoclass personaNueva = new empleadoclass("Juan Miguel", "584743454343", "20/03/1999", "324333", "Guatemala");
//        personaDao.insertar(personaNueva);

       // Modifica un objeto de persona existente
//        empleadoclass personaModifcar = new  empleadoclass(1, "Luis Ochoa", "5759847475984", "12/09/1999", "32434342", "Santa Apolonia");
//        personaDao.actualizar(personaModifcar);
          
        //Eliminar un registro
        empleadoclass personaEliminar = new empleadoclass(8); //ingresa id_persona a eliminar
        personaDao.eliminar(personaEliminar);
        

        List<empleadoclass> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = "+persona);
        });
        
    }
    
    
}
