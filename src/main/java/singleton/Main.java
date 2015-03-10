package singleton;

/**
 * Creates the instance of the singleton class.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){
        Singleton a = Singleton.getInstance();
        a.demo();

        Singleton b = Singleton.getInstance();
        b.demo();
    }
}
