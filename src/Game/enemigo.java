package Game;

import javax.swing.ImageIcon;

public class enemigo {

    game juego;

    public enemigo(game juego,int columna, int fila) {

        super(columa, fila);
        ImageIcon enemigo=new ImageIcon("imagenes/enemigo1.gif");
        this.juego = juego;
        desplaza_columna = -75;
    }

    public void mover(long valor) {

        if ((desplaza_columna < 0) && (columna < 10)) {
            juego.alcanzado_limite = true;
        }
        if ((desplaza_columna > 0) && (columna > 750)) {
            juego.alcanzado_limite = true;
        }
        super.mover(valor);
    }
    public void avanzar_enemigo(){
        desplaza_columna = -desplaza_columna;
        fila+=15
                if (fila >570) {
            game.notificar_perdedor();
        }
    }
    public void colisiona(graficos imagen){
    }
}
