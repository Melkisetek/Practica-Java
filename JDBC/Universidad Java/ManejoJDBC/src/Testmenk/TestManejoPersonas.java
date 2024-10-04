package Testmenk;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        //Insertando un nuevo objeto de tipo persona
        //Vídeo 182
//        Persona personaNueva = new Persona("Carlos", "Suarez", "CarSuare@gmail.com", "3243332");
//        personaDao.insertar(personaNueva);

      //  Modifica un objeto de persona existente
//        Persona personaModifcar = new Persona(9, "Juan Carlos", "Esparza", "jcesparza@gmail.com", "3243332");
//        personaDao.actualizar(personaModifcar);
          
        //Eliminar un registro
        Persona personaEliminar = new Persona(8); //ingresa id_persona a eliminar
        personaDao.eliminar(personaEliminar);
        

        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = "+persona);
        });
        
    }
}
