package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Implementation for octal observer.
 *
 * @author Yashraj R. Sontakke
 */
public class OctalObserver implements Observer {
    public Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Octal value = " + Integer.toOctalString(subject.getState()));
    }
}
