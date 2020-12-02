
package DTO;

/* Esta clase sirve para asociar un corredor con su dorsal asociado en una carrera */

public class Lista_Corredores {
    
    // Atrivutos del objeto
    private Corredor corredor;
    private int Dorsal;

    /* Contructor del objeto */
    
    public Lista_Corredores(Corredor corredor, int Dorsal) {
        this.corredor = corredor;
        this.Dorsal = Dorsal;
    }

    /* Metodos set de objeto */
    
    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }
    
    /* Metodos get de objeto */

    public Corredor getCorredor() {
        return corredor;
    }

    public int getDorsal() {
        return Dorsal;
    }
    
    /* Metodo toString */

    @Override
    public String toString() {
        return "Lista_Corredores{" + "corredor=" + corredor + ", Dorsal=" + Dorsal + '}';
    }
       
}
