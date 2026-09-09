package desenhos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Brenno Gaspar Pinto
 */
public class Borracha extends Forma {
        
    @Override
    public void desenhar( Graphics g ){
        
        g.setColor( Color.WHITE );
        
        if( !caminho.isEmpty() ){
            for( int i = 0; i < caminho.size() - 1; i++ ) {
                g.drawLine( caminho.get(i).getPosX(), caminho.get(i).getPosY(), caminho.get(i+1).getPosX(), caminho.get(i+1).getPosY() );
            }
        }
        
    }
    
    
}
