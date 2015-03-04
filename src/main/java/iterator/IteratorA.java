package iterator;

/**
 * Iterator implementation for String array.
 *
 * @author Yashraj R. Sontakke
 */
public class IteratorA implements Iterator {

    private String[] elements;
    private int position = 0;

    /**
     * Constructor
     *
     * @param elements the String array.
     */
    public IteratorA(final String[] elements) {
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
        return position < elements.length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object next() {
        return elements[position++];
    }
}
