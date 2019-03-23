package lesson8.shape;

public class Rectangle extends AbstractShape {

    private double sideA;
    private double sideB;

    Rectangle(String name, double sideA, double sideB) {
        super (name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        if (sideA > 0 && sideB > 0) {
            return sideA * sideB;
        }
        return 0;
    }
}
