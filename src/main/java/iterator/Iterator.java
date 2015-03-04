package iterator;

/**
 * Interface for the iterator.
 *
 * @author Yashraj R. Sontakke
 */
public interface Iterator {

    /**
     * Sets the position to the first member of the elements.
     */
    public void first();

    /**
     * Returns true when there are elements present in the iterator.
     */
    public boolean hasNext();

    /**
     * Returns the next {@link Object}.
     */
    public Object next();
}
