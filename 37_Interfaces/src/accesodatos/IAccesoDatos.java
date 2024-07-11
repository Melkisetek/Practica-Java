package accesodatos;

public interface IAccesoDatos {
//Los atributo son costantes
    int MAX_REGISTRO=10;    

//Los metodos son publicos y abstractos, el compilador lo agrega en automatico.
   void inserta();
   void listar();
   void actualizar();
   void eleminar();

}