
package Logica;

import DTO.Corredor;
import java.io.*;
import java.util.*;

public class Persistencia_Datos_Corredores {
    
    /* Ruta del fichero */
    private File Ruta = null;
    /* Atrivutos necesarios para la escritura y lectura de datos */
    private ObjectOutputStream Escribir_Objetos = null;
    private ObjectInputStream Leer_Objetos = null;
    /* Creamos un binculo a la lista de corredores */
    private Lista_Corredores lista_Corredores = new Lista_Corredores();

    /* Contructor de la clase donde indicamos la ubicacion del archibo de guardado */
    public Persistencia_Datos_Corredores() {
        this.Ruta = new File("src\\Logica\\Persistencia_Datos\\Corredores.dat");
    }
    
    /* Este metodo carga los datos de los corredores del fichero al arrayList */
    
    public void Cargar_Corredores(){
        if(Ruta.exists()){
            try{
                Leer_Objetos = new ObjectInputStream(new FileInputStream(Ruta));
                while (true) {
                    lista_Corredores.Añadir_Participante((Corredor) Leer_Objetos.readObject());
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
    
    /* Este metodo guardara los corredores del arrayList en el fichero */

    public void Guardar_Corredores(){
        try{
            Escribir_Objetos = new ObjectOutputStream(new FileOutputStream(Ruta));
            Iterator <Corredor> Lista = lista_Corredores.getLista_Participantes().iterator();
            Corredor c;
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
