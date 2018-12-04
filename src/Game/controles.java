
package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class controles implements KeyListener {

    private static final int numeroTeclas =120;
    private final boolean[] teclas = new boolean[numeroTeclas];
    
    public boolean izquierda;
    public boolean derecha;
    public boolean disparar;
    
    public void actualizar(){
        izquierda = teclas[KeyEvent.VK_LEFT];
        derecha = teclas[KeyEvent.VK_RIGHT];
        disparar = teclas[KeyEvent.VK_SPACE];
    }
    
    //presionas y sueltas el boton
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //cuando se mantiene el boton presionado
    @Override
    public void keyPressed(KeyEvent e) {

    }

    //cuando soltamos la tecla
    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
