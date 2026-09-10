package desenhos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Brenno Gaspar Pinto
 */
public class Borracha extends Forma {
        
    @Override
    public void desenhar( Graphics g ){
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke traco = new BasicStroke( (float) getGrossura(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER );
        g2d.setStroke( traco );
        g2d.setColor( Color.WHITE );
        
        if( !caminho.isEmpty() ){
            for( int i = 0; i < caminho.size() - 1; i++ ) {
                g.drawLine( caminho.get(i).getPosX(), caminho.get(i).getPosY(), caminho.get(i+1).getPosX(), caminho.get(i+1).getPosY() );
            }
        }
        
    }
    
    
}
