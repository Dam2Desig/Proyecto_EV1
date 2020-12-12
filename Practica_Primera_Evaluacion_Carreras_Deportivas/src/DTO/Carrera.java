
package DTO;

import java.io.*;
import java.util.*;

/* Esta objeto sirve para establecer una estancia de los datos de las carreras */

public class Carrera implements Serializable{
    
    // Atrivuto serializable
    private static final long serialVersionUID = 2L;
    // Atrivutos del objetos
    private String Nombre;
    private Date Fecha;
    private String Direcion;
    private int N_Participantes;
    // Este atributo sirve para saver si la carrera ya se realizo o no
    private boolean Realizada;
    // Este atrivuto guarda un corredor y su dorsal asociado
    private List <Lista_Corredores> Lista_Corredores;
    
    /* Contructor del objeto */

    public Carrera(String Nombre, Date Fecha, String Direcion, int N_Participantes) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Direcion = Direcion;
        this.N_Participantes = N_Participantes;
        Realizada = false;
        Lista_Corredores = new ArrayList<Lista_Corredores>(); 
    }
    
    public Carrera() {
        Realizada = false;
        Lista_Corredores = new ArrayList<Lista_Corredores>();  
    }

    /* Metodos set de objeto */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public void setRealizada(boolean Realizada) {
        this.Realizada = Realizada;
    }

    public void setN_Participantes(int N_Participantes) {
        this.N_Participantes = N_Participantes;
    }
    
    /* Metodos get de objeto */

    public String getNombre() {
        return Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getDirecion() {
        return Direcion;
    }

    public int getN_Participantes() {
        return N_Participantes;
    }

    public boolean getRealizada() {
        return Realizada;
    }

    public List<Lista_Corredores> getLista_Corredores() {
        return Lista_Corredores;
    }
    
    /* Metodo toString */

    @Override
    public String toString() {
        return "Carrera{" + "Nombre=" + Nombre + ", Fecha=" + Fecha + ", Direcion=" + Direcion + ", N_Participantes=" + N_Participantes + ", Lista_Corredores=" + Lista_Corredores + '}';
    }
        
    /* Añadir Participante a la carrera */
    
    public void Añadir_Participante(Lista_Corredores L){
        if(Lista_Corredores.size() < N_Participantes){
            Lista_Corredores.add(L);
        }
    }
    
    /* Borrar Participante a la carrera */
    
    public void Borrar_Participante(Lista_Corredores L){
        Iterator <Lista_Corredores> Lista = Lista_Corredores.iterator();
        boolean Salir = false;
        while(Lista.hasNext() && Salir != true){
            if(Lista.next().getCorredor().getNombre().equals(L.getCorredor().getNombre())){
                Lista.remove();
                Salir = true;
            }
        }
    }
    
}
