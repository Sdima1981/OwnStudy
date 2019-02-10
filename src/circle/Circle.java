package circle;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println ("With circle radius equals " + radius);
        System.out.println ("Circle area will be " + area);

    }


}
