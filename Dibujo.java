import java.awt.*;
import java.awt.geom.*;

public class Dibujo extends Canvas {

    private int x1, x2, y1, y2; 
    
    public Dibujo() {

    }

    public void asignaPuntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void paint(Graphics g) {
        //  Escriba su código aquí
        g.drawLine(x1, y1, x2, y2);
    }

}