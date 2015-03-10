package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Implementation for binary observer.
 *
 * @author Yashraj R. Sontakke
 */
public class BinaryObserver implements Observer {

    public Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Binary value = " + Integer.toBinaryString(subject.getState()));
    }
}
