package lesson8.shape;

public class Circle extends AbstractShape {

    private double radius;

    Circle(String name, double radius) {
        super (name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius > 0) {
            return piNumber * (radius * radius);
        }
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}
