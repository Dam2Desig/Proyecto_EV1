
package GUI.SubPantallaCarreras.Tablemodels;

import DTO.Lista_Corredores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tablemodels_Resultados extends AbstractTableModel{
 
    // Atrivutos del objeto
    private List <Lista_Corredores> lista;
    private String[] Nombre_Columnas = {"Nombre", "DNI", "Dolsar", "Posicion"};

    /* Contructores del objeto */
    
    public Tablemodels_Resultados(List <Lista_Corredores> lista) {
        this.lista = lista;
    }
    
    public Tablemodels_Resultados() {
        lista = new ArrayList<>();
    } 

    /* Este metodo nos debuelve el numero de filas */
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    /* Este metodo nos debuelve el numero de columnas */
    
    @Override
    public int getColumnCount() {
        return Nombre_Columnas.length;
    }

    /* Insertamos datos a la tabla */
    
    @Override
    public Object getValueAt(int rewIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lista.get(rewIndex).getCorredor().getNombre();
            case 1:
                return lista.get(rewIndex).getCorredor().getDNI();
            case 2:
                return lista.get(rewIndex).getDorsal();
            case 3:
                return String.valueOf(lista.get(rewIndex).getTiempo());
        }
        return null;
    }

    /* Ponemos nombre a la columnas */
    
    @Override
    public String getColumnName(int i) {
        return Nombre_Columnas[i];
    }
    
}
