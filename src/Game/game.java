
package Game;

import java.awt.event.KeyEvent;

public class game {
        
    public static void main(String[] args) {
        ventana.ventana();
        
        int x = nave.getX(); //"getX()" = posición x
        //y = nave.getY();
        System.out.println(nave.getLocation()); //Con "getLocation" dentro del println imprimimos la posición de la imagen.
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_RIGHT:
                movimiento.main(args);
            break;
            
            case KeyEvent.VK_LEFT:
                if(nave.getX() >= 0) 
                nave.setLocation(x-20, y);
            break;
            
            case KeyEvent.VK_SPACE:
                
                break;
        }
    }  
    
}
