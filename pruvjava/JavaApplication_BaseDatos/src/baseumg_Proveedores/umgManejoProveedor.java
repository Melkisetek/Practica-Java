
package baseumg_Proveedores;
import ModelsBase.proveedoresClass;
import java.util.List;
public class umgManejoProveedor {
    public static void main(String[] args){
        proveedorDAO personaDao = new proveedorDAO();
        //Insertando un nuevo objeto de tipo persona
        
//        proveedoresClass personaNueva = new proveedoresClass("434", "Juana Ruiz", "7687554", "Guatemala");
//        personaDao.insertar(personaNueva);

        // Modifica un objeto de persona existente
//        proveedoresClass personaModifcar = new  proveedoresClass(2, "545", "Menma Max", "758947", "Chimaltenango");
//        personaDao.actualizar(personaModifcar);

        //Eliminar un registro
        proveedoresClass personaEliminar = new proveedoresClass(8); //ingresa id_persona a eliminar
        personaDao.eliminar(personaEliminar);
        
        
        
        List<proveedoresClass> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = "+persona);
        });
    }
    
    
}
