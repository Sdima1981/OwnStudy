package lesson8.car;

import java.util.Objects;

public class PassengerCar extends Car {

    double engineVolume;

    PassengerCar(String name, String make, int doorQuantity, double engineVolume) {
        super (name, make, doorQuantity);
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", doorQuantity='" + doorQuantity + '\'' +
                ", engineVolume=" + engineVolume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals (o)) return false;
        PassengerCar that = (PassengerCar) o;
        return Double.compare (that.engineVolume, engineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash (engineVolume);
    }
}
