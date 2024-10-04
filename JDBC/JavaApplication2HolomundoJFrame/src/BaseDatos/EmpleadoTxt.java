
package BaseDatos;
import ModelsBase.empleadoclass;
import java.io.*;



public class EmpleadoTxt {
   FileWriter fichero = null;
   PrintWriter pw = null;
   public EmpleadoTxt(){
    }
   
public void guardarArchivo(empleadoclass emp){
    try{
        lecturaArchivo archivo = new lecturaArchivo();
        archivo.leerArchivo();
        System.out.println("----->cantidad de datos: "+archivo.datosArchivo.size());
        fichero = new FileWriter("/Users/Melquisedec/Desktop/pruvjava/JavaApplication2HolomundoJFrame/Empleado.txt");
        pw = new PrintWriter(fichero);
        for(int i=0;i<archivo.datosArchivo.size();i++){
            System.out.println("mi array:"+archivo.datosArchivo.get(i));
            pw.println(archivo.datosArchivo.get(i));
        }
        pw.println("Nombre: " + emp.getNombre()+", DPI: "+emp.getDPI()+", Fecha de Nacimiento: "+emp.getfechaNacimiento()+", Telefono: "+emp.gettelefono()+", Dirección: "+emp.getdirecion());
    
    }catch (Exception e){
        e.printStackTrace();
    }finally{
        try {
            // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }
        
    
        
}
   
}