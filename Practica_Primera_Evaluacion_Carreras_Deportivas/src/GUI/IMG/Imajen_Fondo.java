
package GUI.IMG;

import java.awt.*;
import javax.swing.*;

/* Esta clase sirve para establecer el fondo de pantalla de la clase principal */

public class Imajen_Fondo extends JPanel{
    
    // Atrivuto del objeto
    private Image imajen;
    
    public void paint (Graphics g){
        imajen = new ImageIcon(getClass().getResource("Fondo.jpg")).getImage();
        g.drawImage(imajen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
}