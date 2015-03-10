package observer;

import singleton.Singleton;

/**
 * Example working of factory design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();

        HexObserver hexObserver = new HexObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.addObserver(hexObserver);
        subject.addObserver(binaryObserver);
        subject.addObserver(octalObserver);

        System.out.println("State changed to " + 15);
        subject.setState(15);
        System.out.println();
        System.out.println("State changed to " + 10);
        subject.setState(10);

    }
}
