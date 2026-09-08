package ui;

import desenhos.Forma;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import stack.ResizingArrayStack;

/**
 * @author Brenno Gaspar Pinto
 */
public class PainelDesenho extends JPanel {

    // Atributos
    private ResizingArrayStack pilha;

    public void setPilha( ResizingArrayStack pilha ) {
        this.pilha = pilha;
        repaint();
    }
    
    // Função desenhar
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );

        // cor da tela
        g.setColor( Color.WHITE );
        g.fillRect( 0, 0, getWidth(), getHeight() );
        
        // cor do desenho
        for( int i = 0; i < pilha.getSize(); i++ ){
            Forma forma = (Forma) pilha.get( i );
            forma.desenhar( g );
        }
        
    }
    
}
