
package Logica;

import DTO.Carrera;
import java.io.*;
import java.util.*;

public class Persistencia_Datos_Carreras {
    
    /* Ruta del fichero */
    private File Ruta = null;
    /* Atrivutos necesarios para la escritura y lectura de datos */
    private ObjectOutputStream Escribir_Objetos = null;
    private ObjectInputStream Leer_Objetos = null;
    /* Creamos un binculo a la lista de carreras */
    private Lista_Carreras lista_Carreras = new Lista_Carreras();
    
    /* Contructor de la clase donde indicamos la ubicacion del archibo de guardado */
    public Persistencia_Datos_Carreras() {
        this.Ruta = new File("src\\Logica\\Persistencia_Datos\\Carreras.dat");
    }
    
    /* Este metodo carga los datos de las carreras del fichero al arrayList */
    
    public void Cargar_Carreras(){
        if(Ruta.exists()){
            try{
                Leer_Objetos = new ObjectInputStream(new FileInputStream(Ruta));
                while (true) {
                    lista_Carreras.Añadir_Participante((Carrera) Leer_Objetos.readObject());
                }
            } catch (EOFException e) {
                
            } catch (FileNotFoundException e) {
                System.out.println("Fichero no encontrado");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Error en la clase: " + e.getMessage());
            } finally {
                if(Leer_Objetos != null){
                    try{
                        Leer_Objetos.close();
                    } catch (IOException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }
    }
    
   /* Este metodo guardara las carreras del arrayList en el fichero */

    public void Guardar_Carreras(){
        try{
            Escribir_Objetos = new ObjectOutputStream(new FileOutputStream(Ruta));
            Iterator <Carrera> Lista = Lista_Carreras.getLista_Carrera().iterator();
            Carrera c;
            while(Lista.hasNext()){
                c = Lista.next();
                Escribir_Objetos.writeObject(c);
            }           
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(Escribir_Objetos != null){
                try{
                    Escribir_Objetos.close();
                } catch (IOException e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
    
}
