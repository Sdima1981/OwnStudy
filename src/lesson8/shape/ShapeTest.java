package lesson8.shape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circleArea = new Circle ("Circle", 7);
        Shape triangleArea = new Triangle ("Triangle", 3, 7);
        Shape squareArea = new Square ("Square", 5);
        Shape rectangleArea = new Rectangle ("Rectangle", 3, 5);
        Shape rhombusArea = new Rhombus ("Rhombus", 3, 8);

        Shape[] areas = {circleArea, triangleArea, squareArea, rectangleArea, rhombusArea};
        for (Shape sh : areas) {
            sh.getName ();
            sh.getArea ();
            System.out.println (sh.getName () + " area  is equals to " + sh.getArea ());
        }
    }
}
