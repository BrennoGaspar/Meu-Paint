package desenhos;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Brenno Gaspar Pinto
 */
public class Elipse extends Forma {
    
    @Override
    public void desenhar( Graphics g ){        
        int iniXD = iniX < fimX ? iniX : fimX;
        int fimXD = iniX > fimX ? iniX : fimX;
        int iniYD = iniY < fimY ? iniY : fimY;
        int fimYD = iniY > fimY ? iniY : fimY;
        
        int largura = fimXD - iniXD;
        int altura = fimYD - iniYD;
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke traco = new BasicStroke( (float) getGrossura(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER );
        g2d.setStroke( traco );
        if( corPreenchimento != null ) {
            g2d.setColor( corPreenchimento );
            g2d.fillOval( iniXD, iniYD, largura, altura );
        }
        g2d.setColor( corDoContorno );
        g2d.drawOval( iniXD, iniYD, largura, altura );
        
    }
    
}
