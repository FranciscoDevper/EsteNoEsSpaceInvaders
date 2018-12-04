package Game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panel1 extends javax.swing.JPanel {

    private Image fondo;

    public panel1(Image fondo) {
        this.fondo = fondo;
        Dimension tamaño = new Dimension(fondo.getWidth(null), fondo.getHeight(null));
        this.setPreferredSize(tamaño);
        this.setMaximumSize(tamaño);
        //this.setMaximumSize(tamaño);
        this.setSize(tamaño);
        this.setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(fondo, 0, 0, null);
    }
}
