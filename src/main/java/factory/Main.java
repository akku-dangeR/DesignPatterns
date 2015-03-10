package factory;

import java.util.ArrayList;

/**
 * Example working of factory design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(ShapeFactory.createShape(ShapeType.CIRCLE));
        shapes.add(ShapeFactory.createShape(ShapeType.SQAURE));
        shapes.add(ShapeFactory.createShape(ShapeType.RECTANGLE));
        shapes.add(ShapeFactory.createShape(ShapeType.CIRCLE));

        for (Shape shape:shapes){
            shape.draw();
        }
    }
}
