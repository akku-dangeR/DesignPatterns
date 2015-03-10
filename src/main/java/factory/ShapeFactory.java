package factory;

/**
 * Implement factory design pattern
 *
 * @author Yashraj R. Sontakke
 */
public class ShapeFactory {

    public static Shape createShape(final ShapeType shapeType){
        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case SQAURE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalStateException("Invalid shape type");
        }
    }
}
