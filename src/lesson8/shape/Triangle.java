package lesson8.shape;

public class Triangle extends AbstractShape {

    private double height;
    private double base;

    Triangle(String name, double height, double base) {
        super (name);
        this.height = height;
        this.base = base;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        if (base > 0 && height > 0) {
            return 0.5 * (base * height);
        }
        return 0;
    }
}
