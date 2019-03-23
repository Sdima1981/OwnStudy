package lesson8.shape;

public class Square extends AbstractShape {

    private double side;

    Square(String name, double side) {
        super (name);
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        if (side > 0) {

            return side * side;
        }
        return 0;
    }
}
