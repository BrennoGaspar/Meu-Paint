package ui;

import desenhos.Forma;
import desenhos.Linha;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 * @author Brenno Gaspar Pinto
 */
public class PainelDesenho extends JPanel {

    // Atributos
    private List<Forma> formas;

    // Construtor
    public PainelDesenho() {
        formas = new ArrayList<>();
    }
    
    // Função desenhar
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );

        // cor da tela
        g.setColor( Color.WHITE );
        g.fillRect( 0, 0, getWidth(), getHeight() );
        
        // cor do desenho
        for( Forma forma : formas ){
            forma.desenhar( g );
        }
        
    }
    
    public void adicionarForma( Forma forma ){
        formas.add( forma );
    }
    
}
