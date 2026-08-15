package gui.geom;

/**
 * @author Brenno Gaspar Pinto
 */
public class Ponto {
    
    // Atributos
    private int posX;
    private int posY;
    
    // Construtor
    public Ponto( int posX, int posY ) {
        this.posX = posX;
        this.posY = posY;
    }
    
    // Getters
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    // Setters
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
}
