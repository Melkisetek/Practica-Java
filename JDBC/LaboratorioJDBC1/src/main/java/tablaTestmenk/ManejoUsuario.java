
package tablaTestmenk;
import Datos.usuarioDAO;
import Dominio.usuario;
import java.util.List;

public class ManejoUsuario {
        public static void main(String[] args) {
        usuarioDAO personaDao = new usuarioDAO();
        //Insertando un nuevo objeto de tipo persona
        //Vídeo 182
//         usuario personaNueva = new usuario("Elena Garcia", "89125EG");
//        personaDao.insertar(personaNueva);

        //  Modifica un objeto de persona existente
//        usuario personaModifcar = new usuario(1,"Madelin Mendez", "21125MM");
//        personaDao.actualizar(personaModifcar);
        //Eliminar un registro
        usuario personaEliminar = new usuario(2); //ingresa id_persona a eliminar
        personaDao.eliminar(personaEliminar);

        List<usuario> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}
//para reemplazar una clase presionamos Ctrl+h