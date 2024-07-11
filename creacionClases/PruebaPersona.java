public class PruebaPersona {
    public static void main(String[] args) {
        //objeto
        AtributosMetodosDeClase persona1;
        persona1 = new AtributosMetodosDeClase();

        persona1.nombre="Juan";
        persona1.Apellido="Mandiel";
        persona1.desplegarInformacion();

        //nuevo objeto
        AtributosMetodosDeClase persona2 = new AtributosMetodosDeClase();
        System.out.println("----------------------------------");

        persona2.nombre="Lucas";
        persona2.nombre="Ramos";

        persona2.desplegarInformacion();
               
    }
}
