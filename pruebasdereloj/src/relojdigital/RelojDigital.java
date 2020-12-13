/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdigital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class RelojDigital extends JLabel implements Serializable
{
    /**
     * Nuestras dos propiedades
     */
    private boolean formato24;
    
    /**
     * Esto son atributos (sin getters ni setters, solo para uso interno.
     */
    private final SimpleDateFormat sdf24h = new SimpleDateFormat("HH:mm:ss");
    private final SimpleDateFormat sdf12h = new SimpleDateFormat("hh:mm:ss a");
    
    /**
     * Listener de nuestro componente
     */
    
    public RelojDigital()
    {
        //Aquí  metemos el método clave. Un timer que se ejecuta cada segundo para
        //actualizar la hora.
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Date horaActual = new Date();

                //Decidimos con que formato mostramos la hora
                if (formato24)
                    setText(sdf24h.format(horaActual));
                else
                    setText(sdf12h.format(horaActual));
                
               
            }
        }, 0, 1000);
    }

    public boolean isFormato24() {
        return formato24;
    }
    
    public void setFormato24 (boolean formato24){
        this.formato24 = formato24;
    }

 
    /**
     * Método para comprobar si dos horas coinciden
     */
    private Date horasCoinciden(Date horaActual)
    {
      return horaActual;
        
    }
}
