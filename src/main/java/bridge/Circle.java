package bridge;

/**
 * Implementation for a circle
 *
 * @author Yashraj R. Sontakke
 */
public class Circle extends Shape {

    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius);
    }
}
