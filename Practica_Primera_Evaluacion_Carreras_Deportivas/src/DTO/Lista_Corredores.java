
package DTO;

import java.io.Serializable;

/* Esta clase sirve para asociar un corredor con su dorsal asociado en una carrera */

public class Lista_Corredores implements Comparable<Lista_Corredores>, Serializable{
    
    // Atrivuto serializable
    private static final long serialVersionUID = 1L;
    // Atrivutos del objeto
    private Corredor corredor;
    private int dorsal;
    private int tiempo;

    /* Contructor del objeto */
    
    public Lista_Corredores(Corredor corredor, int dorsal) {
        this.corredor = corredor;
        this.dorsal = dorsal;
    }

    /* Metodos set de objeto */
    
    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    /* Metodos get de objeto */

    public Corredor getCorredor() {
        return corredor;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    /* Metodo toString */

    @Override
    public String toString() {
        return "Lista_Corredores{" + "corredor=" + corredor + ", Dorsal=" + dorsal + '}';
    }


    @Override
    public int compareTo(Lista_Corredores t) {
        String n1 = String.valueOf(tiempo);
        String n2 = String.valueOf(t.getTiempo());
        return n1.compareTo(n2);
    }
}
