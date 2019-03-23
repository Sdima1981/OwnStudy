package lesson8.car;

import java.util.Objects;

public class Truck extends Car {
    int maxLoad;

    Truck(String name, String make, int doorQuantity, int maxLoad) {
        super (name, make, doorQuantity);
        this.maxLoad = maxLoad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Truck truck = (Truck) o;
        return  maxLoad == truck.maxLoad;
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), maxLoad);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", doorQuantity='" + doorQuantity + '\'' +
                "maxLoad=" + maxLoad +
                '}';
    }

}
