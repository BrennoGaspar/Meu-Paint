package gui.geom;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Brenno Gaspar Pinto
 */
public class Poligono extends Forma {
    
    // Atributos
    private int quantidadeLados;
    
    // Construtor
    public Poligono ( int lados ) {
        this.quantidadeLados = lados;
    }
    
    // Métodos
    @Override
    public void desenhar( Graphics g ){
        
        int cat1 = fimX - iniX;
        int cat2 = fimY - iniY;
        double tamanho = Math.hypot( cat1, cat2 );
        double tamanhoAngulo = 360.0 / quantidadeLados;
        double anguloAtual = Math.toDegrees( Math.atan2( cat2, cat1 ) );
        
        int[] xs = new int[quantidadeLados];
        int[] ys = new int[quantidadeLados];
        
        for( int i = 0; i < quantidadeLados; i++ ) {
            double x = iniX + tamanho * Math.cos( Math.toRadians(anguloAtual) );
            double y = iniY + tamanho * Math.sin(Math.toRadians(anguloAtual) );
            xs[i] = (int) x;
            ys[i] = (int) y;
            anguloAtual += tamanhoAngulo;
        }
        
        g.setColor( corPreenchimento );
        g.fillPolygon( xs, ys, quantidadeLados );
        
        g.setColor( corDoContorno );
        g.drawPolygon( xs, ys, quantidadeLados );
        
    }
    
}
