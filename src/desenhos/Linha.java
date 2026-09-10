package desenhos;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Brenno Gaspar Pinto
 */
public class Linha extends Forma {
    
    @Override
    public void desenhar( Graphics g ){
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke traco = new BasicStroke( (float) getGrossura(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER );
        g2d.setStroke( traco );
        g2d.setColor( corDoContorno );
        g2d.drawLine( getIniX(), getIniY(), getFimX(), getFimY() );
        
    }
    
}