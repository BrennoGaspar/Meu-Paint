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
    private Forma emConstrucao;

    public void setPilha( ResizingArrayStack pilha ) {
            this.pilha = pilha;
            repaint();
    }
    
    public void setFormaEmConstrucao( Forma emConstrucao ) {
        this.emConstrucao = emConstrucao;
    }
    
    // Função desenhar
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );

        // cor da tela
        g.setColor( Color.WHITE );
        g.fillRect( 0, 0, getWidth(), getHeight() );
        
        // cor do desenho
        if( pilha != null ) {
            for( int i = 0; i < pilha.getSize(); i++ ){
                Forma forma = (Forma) pilha.get( i );
                forma.desenhar( g );
            }
        }
        if( emConstrucao != null ) {
            emConstrucao.desenhar( g );
        }
        
    }
    
}
