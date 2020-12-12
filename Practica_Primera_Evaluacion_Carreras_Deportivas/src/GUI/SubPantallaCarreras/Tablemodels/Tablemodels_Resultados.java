
package GUI.SubPantallaCarreras.Tablemodels;

import DTO.Carrera;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tablemodels_Resultados extends AbstractTableModel{
 
    // Atrivutos del objeto
    private Carrera C;
    private String[] Nombre_Columnas = {"Nombre", "DNI", "Dolsar", "Posicion"};

    /* Contructor del objeto */
    
    public Tablemodels_Resultados(Carrera c) {
        this.C = c;
    } 

    /* Este metodo nos debuelve el numero de filas */
    
    @Override
    public int getRowCount() {
        return C.getLista_Corredores().size();
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
                //return ;
            case 1:
                
                //return ;
        }
        return null;
    }

    /* Ponemos nombre a la columnas */
    
    @Override
    public String getColumnName(int i) {
        return Nombre_Columnas[i];
    }
    
}
