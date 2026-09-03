package stack;

import java.util.Arrays;

/**
 * @author Brenno Gaspar Pinto
 */
public class ResizingArrayStack<Forma> implements Stack<Forma> {

    // Atributos
    private Forma[] values;
    private int top = -1;
    private int size = 0;
    
    // Construtor
    public ResizingArrayStack () {
        this.values = (Forma[]) new Object[1];
    }
    
    // Funções
    @Override
    public void push(Forma value) {
        if( top == values.length-1 ) {
            int newSize = values.length * 2;
            values = Arrays.copyOf( values, newSize );
        }
        top++;
        size++;
        values[top] = value;
    }

    @Override
    public Forma peek() {
        if( !isEmpty() ) {  
            return values[top];
        }
        return null;
    }

    @Override
    public Forma pop() {
        if( !isEmpty() ) {
            Forma t = values[top];
            values[top] = null;
            top--;
            size--;
            if( size > 0 && size <= values.length / 4 && values.length > 1 ) {
                values = Arrays.copyOf(values, values.length / 2);
            }
            return t;
        }
        return null;
    }

    @Override
    public void clear() {
        for( int i = 0; i < size; i++ ) {
            values[i] = null;
        }
        top = -1;
        size = 0;
        values = (Forma[]) new Object[1]; // o array vira de tamanho 1
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    public Forma get( int i ) {
        return values[i];
    }
    
}
