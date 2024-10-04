/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.io.*;
import ModelsBase.proveedoresClass;


/**
 *
 * @author Melquisedec
 */
public class proveedorTxt {
    FileWriter fichero = null;
   PrintWriter pw = null;
   public proveedorTxt(){
    }
public void guardarArchivo (proveedoresClass emp){
    try {
        lecturaArchivo archivo = new lecturaArchivo();
        archivo.leerArchivo();
        System.out.println("----->cantidad de datos: "+archivo.datosArchivo.size());
        fichero = new FileWriter("/Users/Melquisedec/Desktop/pruvjava/JavaApplication2HolomundoJFrame/Proveedor.txt");
        
        pw = new PrintWriter(fichero);
        for(int i=0;i<archivo.datosArchivo.size();i++){
            System.out.println("mi array:"+archivo.datosArchivo.get(i));
            pw.println(archivo.datosArchivo.get(i));
        }
        pw.println("Codigo: " + emp.getCodigo()+", Nombre: "+emp.getNombre()+", Telefono: "+emp.getTelefono()+", Dirección: "+emp.getDireccion());

    }catch (Exception e){
        e.printStackTrace();
    }finally{
        try{
             // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
        } catch (Exception e2){
            e2.printStackTrace();
        }
    }
}  
    
}
