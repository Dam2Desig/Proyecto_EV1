
package Logica;

import DTO.Carrera;
import java.io.Serializable;
import java.util.*;

public class Lista_Carreras {
    
    // Atrivutos del objeto
    private static List <Carrera> Lista_Carrera = new ArrayList<>();

    /* Este metodo añade una carrera a Lista carreras */
    
    public void Añadir_Carrera(Carrera c){
        Lista_Carrera.add(c);
    }
    
    /* Este metodo borra una carrera de Lista carreras */
    
    public void Borrar_Carrera(Carrera c){
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
    
    public void Actualizar_Carrera(Carrera c_Antiguo, Carrera c_Nuevo){
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
    
    /* Este metodo devuelve las carreras que todavia no se an realizado */
    
    public List<Carrera> Lista_sin_correr (){
        List <Carrera> L = new ArrayList<>();  
        Carrera c;
        Iterator <Carrera> Lista = Lista_Carrera.iterator();
        while(Lista.hasNext()){
            if((c = Lista.next()).getRealizada() == false){
                L.add(c);
            }
        }
        return L;
    }
    
    /* Este metodo devuelve las carreras que todavia no se an realizado */
    
    public List<Carrera> Lista_Carreras_Realizadas (){
        List <Carrera> L = new ArrayList<>();  
        Carrera c;
        Iterator <Carrera> Lista = Lista_Carrera.iterator();
        while(Lista.hasNext()){
            if((c = Lista.next()).getRealizada()){
                L.add(c);
            }
        }
        return L;
    }
    
    /* Este metodo devuelve el objeto carreras que buscamos para ver los resultados */
    
    public Carrera Buscar_Resultados(String nombre, Date fecha){
        Iterator <Carrera> Lista = Lista_Carrera.iterator();
        boolean Salir = false;
        Carrera c = null;
        while(Lista.hasNext() && Salir != true){
            c = Lista.next();
            if(c.getNombre().equals(nombre) || c.getFecha().equals(fecha)){
                Salir = true;
            }
        }
        return c;
    }

    /* Metodo get del objeto para persistencia de datos */

    public List<Carrera> getLista_Carrera() {
        return Lista_Carrera;
    }

}
