package proxy;

/**
 * Example working of proxy design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){
        Image image1 = new ProxyImage("image1.jpg");
        image1.display();
        image1.display();

        Image image2 = new RealImage("image2.jpg");
        image2.display();
        image2.display();

        image1.display();
    }
}
