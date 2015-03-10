package bridge;

/**
 * Working example of factory design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){
        Shape redShape = new Circle(new RedCircle() ,10);
        Shape greenShape = new Circle(new GreenCircle() ,20);

        redShape.draw();
        greenShape.draw();
    }
}
