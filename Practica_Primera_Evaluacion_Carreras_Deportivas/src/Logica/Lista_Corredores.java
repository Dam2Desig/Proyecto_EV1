
package Logica;

import java.util.*;
import DTO.Corredor;

/* Esta clase guardara todos los participantes de programa */

public class Lista_Corredores {
    
    // Atrivutos del objeto
    private static List <Corredor> Lista_Participantes = new ArrayList<>();

    /* Este metodo añade un corredor a Lista participantes */
    
    public void Añadir_Participante(Corredor c){
        Lista_Participantes.add(c);
        Ordenar_Corredores();
    }
    
    /* Este metodo borra un corredor a Lista participantes */
    
    public void Borrar_Participante(Corredor c){
        Iterator <Corredor> Lista = Lista_Participantes.iterator();
        boolean Salir = false;
        while(Lista.hasNext() && Salir != true){
            if(Lista.next().getDNI().equalsIgnoreCase(c.getDNI())){
                Lista.remove();
                Salir = true;
            }
        }
    }
    
    /* Metodo de actualizar datos de los corredores */
    
    public void Actualizar_Participantes(Corredor c_Antiguo, Corredor c_Nuevo){
        Iterator <Corredor> Lista = Lista_Participantes.iterator();
        boolean Salir = false;
        Corredor c;
        while(Lista.hasNext() && Salir != true){
            c = Lista.next();
            if(c.getDNI().equalsIgnoreCase(c_Antiguo.getDNI())){
                c.setNombre(c_Nuevo.getNombre());
                c.setDNI(c_Nuevo.getDNI());
                c.setFecha_Nacimiento(c_Nuevo.getFecha_Nacimiento());
                c.setDirecion(c_Nuevo.getDirecion());
                c.setN_Contacto(c_Nuevo.getN_Contacto());
                Salir = true;
            }
        }
        Ordenar_Corredores();
    }
    
    /* Este metodo Ordena a los corredores por fecha de nacimiento */
    
    public void Ordenar_Corredores(){
        Collections.sort(Lista_Participantes);
    }
    
    /* Metodo get del objeto */
    
    public List<Corredor> getLista_Participantes() {
        return Lista_Participantes;
    }  
    
}
