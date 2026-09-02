package desenhos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Brenno Gaspar Pinto
 */
public class Retangulo extends Forma {
    
    @Override
    public void desenhar( Graphics g ){
        
        int iniXD = iniX < fimX ? iniX : fimX;
        int fimXD = iniX > fimX ? iniX : fimX;
        int iniYD = iniY < fimY ? iniY : fimY;
        int fimYD = iniY > fimY ? iniY : fimY;
        
        int largura = fimXD - iniXD;
        int altura = fimYD - iniYD;
    
        g.setColor( corPreenchimento );
        g.fillRect( iniXD, iniYD, largura, altura );
            
        g.setColor( corDoContorno );
        g.drawRect( iniXD, iniYD, largura, altura );
        
    }
    
}
