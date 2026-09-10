package ui;

import desenhos.Forma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JSlider;
import stack.ResizingArrayStack;

/**
 * @author Brenno Gaspar Pinto
 */
public class PainelDesenho extends JPanel {

    // Atributos
    private ResizingArrayStack pilha;
    private Forma emConstrucao;
    private JSlider grossuraPincel;
    
    // Criar o Slider
    private void criarSlider() {
        
        setLayout( new BorderLayout() );
        
        grossuraPincel = new JSlider( JSlider.VERTICAL, 1, 10, 1 );
        grossuraPincel.setMajorTickSpacing( 1 );
        grossuraPincel.setPaintLabels( true );
        grossuraPincel.setFocusable( false );
        grossuraPincel.setPreferredSize( new java.awt.Dimension( 35, 200 ) );       
        
        JPanel painelContainer = new javax.swing.JPanel();
        painelContainer.add( grossuraPincel );
        add( painelContainer, BorderLayout.WEST );
        
    }
    
    // Método getter
    public float getGrossura() {
        return (float) grossuraPincel.getValue();
    }
    
    // Métodos setters
    public void setPilha( ResizingArrayStack pilha ) {
            this.pilha = pilha;
            criarSlider();
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