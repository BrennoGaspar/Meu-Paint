package desenhos;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Brenno Gaspar Pinto
 */
public class Texto extends Forma {
        
    // Atributos
    private String conteudo;
    private Ponto pontoInicio;
    
    // Construtor
    public Texto ( String conteudo, Ponto pontoInicio ) {
        this.conteudo = conteudo;
        this.pontoInicio = pontoInicio;
    }
    
    @Override
    public void desenhar( Graphics g ){
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke traco = new BasicStroke( (float) getGrossura(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER );
        g2d.setStroke( traco );
        g2d.setColor( corDoContorno );
        
        int tamanhoFonte = (int) getGrossura() * 5;
        g2d.setFont( new Font("Arial", Font.PLAIN, tamanhoFonte) );
        
        g2d.drawString( conteudo, pontoInicio.getPosX(), pontoInicio.getPosY() + tamanhoFonte/2 );
        
    }
    
}