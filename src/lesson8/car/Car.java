package lesson8.car;

import java.util.Objects;

public class Car {
    protected String name;
    protected String make;
    protected int doorQuantity;

    Car(String name, String make, int doorQuantity) {
        this.name = name;
        this.make = make;
        this.doorQuantity = doorQuantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", doorQuantity=" + doorQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Car car = (Car) o;
        return doorQuantity == car.doorQuantity &&
                Objects.equals (name, car.name) &&
                Objects.equals (make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name, make, doorQuantity);
    }
}
