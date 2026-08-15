package gui.geom;

import java.awt.Graphics;

/**
 * @author Brenno Gaspar Pinto
 */
public class Linha extends Forma {
    
    @Override
    public void desenhar( Graphics g ){
        g.setColor( corDoContorno );
        g.drawLine( getIniX(), getIniY(), getFimX(), getFimY() );
    }
    
}
