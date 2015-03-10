package bridge;

/**
 * Implements green circle
 *
 * @author Yashraj R. Sontakke
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println(String.format("Draw GREEN circle of radius %d", radius));
    }
}
