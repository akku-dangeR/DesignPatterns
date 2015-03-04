package iterator;

/**
 * Company A contains a array of Strings.
 *
 * @author Yashraj R. Sontakke
 */
public class CompanyA {

    private String[] elements;

    public CompanyA(final String[] elements) {
        this.elements = elements;
    }

    public Iterator getIterator() {
        return new IteratorA(elements);
    }
}
