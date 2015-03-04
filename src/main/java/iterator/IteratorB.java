package iterator;

import java.util.ArrayList;

/**
 * Iterator implementation for String ArrayList.
 *
 * @author Yashraj R. Sontakke
 */
public class IteratorB implements Iterator {
    private ArrayList<String> elements;
    private int position = 0;

    /**
     * Constructor
     *
     * @param elements the String array.
     */
    public IteratorB(final ArrayList<String> elements) {
        this.elements = elements;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void first() {
        position = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object next() {
        return elements.get(position++);
    }
}
