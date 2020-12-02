
package DTO;

import java.io.*;
import java.util.*;

/* Esta objeto sirve para establecer una estancia de los datos de las corredores */

public class Corredor implements Serializable, Comparable<Corredor>{
    
    // Atrivuto serializable
    private static final long serialVersionUID = 1L;
    // Atrivutos del objetos
    private String Nombre;
    private String DNI;
    private Date Fecha_Nacimiento;
    private String Direcion;
    private int N_Contacto;
    
    /* Contructor del objeto */

    public Corredor(String Nombre, String DNI, Date Fecha_Nacimiento, String Direcion, int N_Contacto) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Direcion = Direcion;
        this.N_Contacto = N_Contacto;
    }
    
    /* Metodos set de objeto */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public void setN_Contacto(int N_Contacto) {
        this.N_Contacto = N_Contacto;
    }
        
    /* Metodos get de objeto */

    public String getNombre() {
        return Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public String getDirecion() {
        return Direcion;
    }

    public int getN_Contacto() {
        return N_Contacto;
    }
    
    /* Ordenamos a los corredores por fecha de nacimiento */

    @Override
    public int compareTo(Corredor c) {
        return this.Fecha_Nacimiento.compareTo(c.Fecha_Nacimiento);
    }
    
    /* Metodo toString */

    @Override
    public String toString() {
        return "Corredor{" + "Nombre=" + Nombre + ", DNI=" + DNI + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Direcion=" + Direcion + ", N_Contacto=" + N_Contacto + '}';
    }

}
