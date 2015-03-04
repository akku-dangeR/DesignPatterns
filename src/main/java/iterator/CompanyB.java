package iterator;

import java.util.ArrayList;

/**
 * Company B contains a arrayList of Strings.
 *
 * @author Yashraj R. Sontakke
 */
public class CompanyB {

    private ArrayList<String> elements;

    public CompanyB(final ArrayList<String> elements) {
        this.elements = elements;
    }

    public Iterator getIterator() {
        return new IteratorB(elements);
    }
}
