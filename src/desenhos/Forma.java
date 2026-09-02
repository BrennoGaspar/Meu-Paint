package desenhos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

/**
 * @author Brenno Gaspar Pinto
 */
public abstract class Forma {
    
    // Atributos
    protected int iniX;
    protected int iniY;
    protected int fimX;
    protected int fimY;
    protected Color corDoContorno;
    protected Color corPreenchimento;
    protected List<Ponto> caminho;

    public abstract void desenhar( Graphics g );
    
    // Getters
    public int getIniX() {
        return iniX;
    }

    public int getIniY() {
        return iniY;
    }

    public int getFimX() {
        return fimX;
    }

    public int getFimY() {
        return fimY;
    }
    
    public Color getCorDoContorno() {
        return corDoContorno;
    }

    public Color getCorPreenchimento() {
        return corPreenchimento;
    }

    public List<Ponto> getCaminho() {
        return caminho;
    }
    
    // Setters
    public void setIniX(int iniX) {
        this.iniX = iniX;
    }

    public void setIniY(int iniY) {
        this.iniY = iniY;
    }

    public void setFimX(int fimX) {
        this.fimX = fimX;
    }

    public void setFimY(int fimY) {
        this.fimY = fimY;
    }
    
    public void setCorDoContorno( Color cor ) {
        this.corDoContorno = cor;
    }

    public void setCorPreenchimento(Color corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }

    public void setCaminho(List<Ponto> caminho) {
        this.caminho = caminho;
    }
    
}
