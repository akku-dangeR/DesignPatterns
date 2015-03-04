package iterator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Prints the elements of both the companys.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {

    public static void main(String[] args){

        final String[] elementsA = {"ONE", "TWO", "THREE"};
        final ArrayList<String> elementsB = new ArrayList<String>(Arrays.asList("FOUR", "FIVE", "SIX"));

        final CompanyA companyA = new CompanyA(elementsA);
        final CompanyB companyB = new CompanyB(elementsB);

        printElements(companyA.getIterator());
        printElements(companyB.getIterator());
    }

    public static void printElements(final Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
