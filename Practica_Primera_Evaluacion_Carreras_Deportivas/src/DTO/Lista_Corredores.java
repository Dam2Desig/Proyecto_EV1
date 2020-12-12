
package DTO;

/* Esta clase sirve para asociar un corredor con su dorsal asociado en una carrera */

public class Lista_Corredores {
    
    // Atrivutos del objeto
    private Corredor corredor;
    private int dorsal;
    private double tiempo;

    /* Contructor del objeto */
    
    public Lista_Corredores(Corredor corredor, int dorsal, double tiempo) {
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
    
    /* Metodos get de objeto */

    public Corredor getCorredor() {
        return corredor;
    }

    public int getDorsal() {
        return dorsal;
    }
    
    /* Metodo toString */

    @Override
    public String toString() {
        return "Lista_Corredores{" + "corredor=" + corredor + ", Dorsal=" + dorsal + '}';
    }
       
}
