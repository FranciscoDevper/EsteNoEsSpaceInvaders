package Game;

import javax.swing.ImageIcon;

public class nave extends Game.movimiento {

    boolean moverDerecha;
    boolean moverIzquierda;

    public nave(int xPosicion, int yPosicion, int velocidad) {
        super(xPosicion, yPosicion, velocidad);
        ImageIcon nave = new ImageIcon("/imagenes/nave1.gif");
        moverIzquierda = false;
        moverDerecha = false;
    }

    public static void moverDerecha() {
        if (nave.getX() <= 365) { //lb_Hunter podrá avanzar hacia la derecha mientras sea menor o igual a 365 (limite), si lo supera, deja de avanzar hacia ese lado.
            nave.setLocation(x + 20, y);
        }
    }
}
