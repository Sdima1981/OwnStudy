package car;

public class Car {
    private String color;
    private String make;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println ("Cars color is " + getColor ());
        System.out.println ("Cars make is " + getMake ());
        System.out.println ("Cars year is " + getYear ());
    }
}
