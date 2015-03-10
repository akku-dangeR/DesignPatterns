package bridge;

/**
 * Implements red circle
 *
 * @author Yashraj R. Sontakke
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println(String.format("Draw RED circle of radius %d", radius));
    }
}
