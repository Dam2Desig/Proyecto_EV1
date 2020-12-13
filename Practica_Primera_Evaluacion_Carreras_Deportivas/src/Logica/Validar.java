
package Logica;

import java.util.*;

/* Esta clase sirbe para validar los datos introducidos por el usuario */

public class Validar {
    
    /* Este metodo valida el nombre del particiante y el nombre de las carreras */
    
    public boolean V_Nombre (String Nombre){
        if(!Nombre.equals("")){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo valida el DNI del particiante */
    
    public boolean V_DNI (String DNI){
        //valida que tenga 8 numeros del 0-9 y la letra del dni
        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }
    
    /* Este metodo valida el Fecha_Nacimiento del particiante */
    
    public boolean V_Fecha_Nacimiento(Date fecha) {
        if(!fecha.equals(new Date())){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo valida el Direcion del particiante y la direcion de la carrera */
        
    public boolean V_Direcion (String Direcion){
        if(!Direcion.equals("")){
            return true;
        } else{
            return false;
        }
    }
        
    /* Este metodo valida el N_Contacto del particiante */
    
    public boolean V_N_Contacto(int N_Contacto){
        int n1 = 100000000;
        int n2 = 999999999;
        if(N_Contacto > n1 || N_Contacto < n2 ){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo valida la fecha de la carrera */
        
    public boolean V_Fecha(Date fecha) {
        if(!fecha.equals(new Date())){
            return true;
        } else{
            return false;
        }
    }
    
    /* Validad numero de participantes */
    
    public boolean V_Participantes(int n){
        if(n > 0){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo sirve para validar el dorsal */

    public boolean V_Dorsal(int dorsal){
        if(dorsal > 0){
            return true;
        } else{
            return false;
        }
    }
    
}
