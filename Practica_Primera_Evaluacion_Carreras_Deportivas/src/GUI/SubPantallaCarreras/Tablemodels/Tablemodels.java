
package GUI.SubPantallaCarreras.Tablemodels;

import DTO.Carrera;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

public class Tablemodels extends AbstractTableModel{
    
    // Atrivutos del objeto
    private List <Carrera> Lista_Carrera;
    private String[] Nombre_Columnas = {"Nombre", "Fecha", "Direcion", "Numero de participantes"};

    /* Contructor del objeto */
    
    public Tablemodels(List<Carrera> Lista_Menus) {
        this.Lista_Carrera = Lista_Menus;
    } 

    /* Este metodo nos debuelve el numero de filas */
    
    @Override
    public int getRowCount() {
        return Lista_Carrera.size();
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
                return Lista_Carrera.get(rewIndex).getNombre();
            case 1:
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date FechaTem = Lista_Carrera.get(rewIndex).getFecha();
                String Fecha = sdf.format(FechaTem);
                return Fecha;
            case 2:
                return Lista_Carrera.get(rewIndex).getDirecion();
            case 3:
                return Lista_Carrera.get(rewIndex).getN_Participantes();
        }
        return null;
    }

    /* Ponemos nombre a la columnas */
    
    @Override
    public String getColumnName(int i) {
        return Nombre_Columnas[i];
    }
    
}
