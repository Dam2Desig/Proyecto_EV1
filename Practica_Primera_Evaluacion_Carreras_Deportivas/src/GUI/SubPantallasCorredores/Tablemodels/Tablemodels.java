
package GUI.SubPantallasCorredores.Tablemodels;

import DTO.Corredor;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

public class Tablemodels extends AbstractTableModel{
    
    // Atrivutos del objeto
    private List <Corredor> Lista_corredores;
    private String[] Nombre_Columnas = {"Nombre", "DNI", "Fecha nacimiento", "Direción", "Telefono"};

    /* Contructor del objeto */
    
    public Tablemodels(List<Corredor> Lista_Menus) {
        this.Lista_corredores = Lista_Menus;
    } 

    /* Este metodo nos debuelve el numero de filas */
    
    @Override
    public int getRowCount() {
        return Lista_corredores.size();
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
                return Lista_corredores.get(rewIndex).getNombre();
            case 1:
                return Lista_corredores.get(rewIndex).getDNI();
            case 2:
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date FechaTem = Lista_corredores.get(rewIndex).getFecha_Nacimiento();
                String Fecha = sdf.format(FechaTem);
                return Fecha;
            case 3:
                return Lista_corredores.get(rewIndex).getDirecion();
            case 4:
                return Lista_corredores.get(rewIndex).getN_Contacto();
        }
        return null;
    }

    /* Ponemos nombre a la columnas */
    
    @Override
    public String getColumnName(int i) {
        return Nombre_Columnas[i];
    }
    
}
