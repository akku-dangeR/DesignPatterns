package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Implementation for hexadecimal observer.
 *
 * @author Yashraj R. Sontakke
 */
public class HexObserver implements Observer{
    public Subject subject;

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Hexadecimal value = " + Integer.toHexString(subject.getState()));
    }
}
