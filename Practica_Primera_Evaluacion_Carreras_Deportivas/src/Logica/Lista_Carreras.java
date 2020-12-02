
package Logica;

import DTO.Carrera;
import java.util.*;

public class Lista_Carreras {
    
    // Atrivutos del objeto
    private static List <Carrera> Lista_Carrera = new ArrayList<>();

    /* Este metodo añade una carrera a Lista carreras */
    
    public void Añadir_Participante(Carrera c){
        Lista_Carrera.add(c);
    }
    
    /* Este metodo borra una carrera de Lista carreras */
    
    public void Borrar_Participante(Carrera c){
        Iterator <Carrera> Lista = Lista_Carrera.iterator();
        boolean Salir = false;
        while(Lista.hasNext() && Salir != true){
            if(Lista.next().getNombre().equals(c.getNombre())){
                Lista.remove();
                Salir = true;
            }
        }
    }
    
        /* Metodo de actualizar datos de los corredores */
    
    public void Actualizar_Participantes(Carrera c_Antiguo, Carrera c_Nuevo){
        Iterator <Carrera> Lista = Lista_Carrera.iterator();
        boolean Salir = false;
        Carrera c;
        while(Lista.hasNext() && Salir != true){
            c = Lista.next();
            if(c.getNombre().equals(c_Antiguo.getNombre())){
                c.setNombre(c_Nuevo.getNombre());
                c.setFecha(c_Nuevo.getFecha());
                c.setDirecion(c_Nuevo.getDirecion());
                c.setN_Participantes(c_Nuevo.getN_Participantes());
                Salir = true;
            }
        }
    }
    
    /* Metodo get del objeto */

    public static List<Carrera> getLista_Carrera() {
        return Lista_Carrera;
    }
    
}
