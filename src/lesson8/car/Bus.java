package lesson8.car;

import java.util.Objects;

public class Bus extends Car {

    int seatCount;

    Bus(String name, String make, int doorQuantity, int seatCount) {
        super (name, make, doorQuantity);
        this.seatCount = seatCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Bus bus = (Bus) o;
        return  seatCount == bus.seatCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), seatCount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", doorQuantity='" + doorQuantity + '\'' +
                "seatCount=" + seatCount +
                '}';
    }
}
