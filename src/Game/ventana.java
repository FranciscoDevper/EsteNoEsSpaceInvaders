
package Game;

import java.awt.Container;
import java.awt.Panel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ventana {
    
    Panel p;
    public static void ventana() {
        JFrame ventana = new JFrame("Esto no es Space Invaders");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //ventana.setLocationRelativeTo(null);
        //ventana.setSize(1200, 1200);
        ventana.setResizable(false);
        
        ImageIcon icon =new ImageIcon(ventana.getClass().getResource("/Imagenes/background.gif"));
        panel1 panel = new panel1(icon.getImage());
        
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setVisible(true);
    }
}
