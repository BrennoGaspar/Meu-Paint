package gui.stack;

/**
 * @author Brenno Gaspar Pinto
 */
public interface Stack<Forma> {
    
    public void push( Forma value );
    public Forma peek();
    public Forma pop();
    public void clear();
    public boolean isEmpty();
    public int getSize();
    
}
