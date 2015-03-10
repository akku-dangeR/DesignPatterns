package bridge;

/**
 * Abstract shape class.
 *
 * @author Yashraj R. Sontakke
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
