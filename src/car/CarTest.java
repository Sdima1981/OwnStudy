package car;

public class CarTest {
    public static void main(String[] args) {
        Car testCar = new Car ();

        testCar.setColor ("Blue");
        testCar.setMake ("Ford");
        testCar.setYear (1985);

        testCar.printInfo ();
    }
}
