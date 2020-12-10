
package Logica;

import java.util.*;

/* Esta clase sirbe para validar los datos introducidos por el usuario */

public class Validar {
    
    /* Este metodo valida el nombre del particiante */
    
    public boolean V_Nombre (String Nombre){
        if(!Nombre.equals("")){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo valida el DNI del particiante */
    
    public boolean V_DNI (String DNI){
        char[] letrasDni = DNI.toCharArray();
        if(!DNI.equals("")){
            return true;
        } else{
            return false;
        }
    }
    
    /* Este metodo valida el Fecha_Nacimiento del particiante */
    
    public boolean V_Fecha_Nacimiento(Date Fecha_Nacimiento){
        int año_max=100;
        int año_min=18;
      System.out.println("*");
        if((Fecha_Nacimiento.getYear()>año_min) && (Fecha_Nacimiento.getYear()<año_max)) {
            System.out.println("hello world");
            return true;
        }
        return false;
    }
    
    /* Este metodo valida el Direcion del particiante */
        
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
        if(N_Contacto < n1 || N_Contacto > n2 ){
            return true;
        } else{
            return false;
        }
    }
        
}
