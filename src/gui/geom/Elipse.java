package gui.geom;

import java.awt.Graphics;

/**
 * @author Brenno Gaspar Pinto
 */
public class Elipse extends Forma {
    
    @Override
    public void desenhar( Graphics g ){
        g.setColor( corDoContorno );
        
        int iniXD = iniX < fimX ? iniX : fimX;
        int fimXD = iniX > fimX ? iniX : fimX;
        int iniYD = iniY < fimY ? iniY : fimY;
        int fimYD = iniY > fimY ? iniY : fimY;
        
        int largura = fimXD - iniXD;
        int altura = fimYD - iniYD;
    
        g.drawOval(iniXD, iniYD, largura, altura );
    }
    
}
