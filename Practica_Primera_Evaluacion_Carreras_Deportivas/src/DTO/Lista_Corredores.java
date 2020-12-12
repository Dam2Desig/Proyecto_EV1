
package DTO;

import java.util.Date;

/* Esta clase sirve para asociar un corredor con su dorsal asociado en una carrera */

public class Lista_Corredores implements Comparable<Lista_Corredores>{
    
    // Atrivutos del objeto
    private Corredor corredor;
    private int dorsal;
    private Date tiempo;

    /* Contructor del objeto */
    
    public Lista_Corredores(Corredor corredor, int dorsal, Date tiempo) {
        this.corredor = corredor;
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    /* Metodos set de objeto */
    
    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }
    
    /* Metodos get de objeto */

    public Corredor getCorredor() {
        return corredor;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Date getTiempo() {
        return tiempo;
    }

    /* Metodo toString */

    @Override
    public String toString() {
        return "Lista_Corredores{" + "corredor=" + corredor + ", Dorsal=" + dorsal + '}';
    }

    @Override
    public int compareTo(Lista_Corredores t) {
        return tiempo.compareTo(t.getTiempo());
    }
       
}
