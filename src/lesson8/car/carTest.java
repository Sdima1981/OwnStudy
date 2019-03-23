package lesson8.car;

public class carTest {



    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar ("Mustang", "Ford", 2, 5.0);
        Truck car2 = new Truck ("F150", "MAN", 3, 32);
        Bus car3 = new Bus ("Yellow","Ikarus", 4, 46 );
        PassengerCar car4 = new PassengerCar ("Mustang", "Ford", 2, 5.0);

        System.out.println (car1);
        System.out.println (car2);
        System.out.println (car3);
        System.out.println (car4);
        System.out.println (car1.equals (car4));
    }
}
