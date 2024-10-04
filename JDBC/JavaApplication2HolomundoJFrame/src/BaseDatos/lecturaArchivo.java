/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Menk 2022
package BaseDatos;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;


/**
 *
 * @author Melquisedec
 */
public class lecturaArchivo {
     File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    public ArrayList<String> datosArchivo= new ArrayList<String>();
    
    public lecturaArchivo(){
        
    }
    
    public void leerArchivo(){
        String linea="";
        try{
         // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("/Users/Melquisedec/Desktop/pruvjava/JavaApplication2HolomundoJFrame/Empleado.txt");
         archivo = new File ("/Users/Melquisedec/Desktop/pruvjava/JavaApplication2HolomundoJFrame/Proveedor.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
            // Lectura del fichero
         
        while((linea=br.readLine())!=null)
             //System.out.println(linea);
            if(linea!="null"){datosArchivo.add(linea);}
            
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{
               if( null != fr ){
                   
               }
           }catch (Exception e2){
               e2.printStackTrace();
           }
        }
    }
}
