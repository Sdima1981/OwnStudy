package lesson6.car;

public class CarTest {

    public static void main(String[] args) {

        CarTest testRunner = new CarTest ();

        testRunner.shouldAccelerate ();
        testRunner.shouldSlowDown ();
        testRunner.isMoving ();
        testRunner.isNotMoving ();
        testRunner.mightAccelerate ();
        testRunner.shouldHitMax ();

    }

    void shouldAccelerate() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 0);
        int expectedResult = 30;
        while (victim.getCurrentSpeed () < 30) {
            victim.accelerate ();
        }
        int actualResult = victim.getCurrentSpeed ();

        if (actualResult == expectedResult) {
            System.out.println ("Test shouldAccelerate PASSED.");
        } else {
            System.out.println ("Test shouldAccelerate FAILED.");
        }
    }

    void shouldSlowDown() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 50);
        int expectedResult = 0;
        while (victim.getCurrentSpeed () > 0) {
            victim.slowDown ();
        }
        int actualResult = victim.getCurrentSpeed ();

        if (actualResult == expectedResult) {
            System.out.println ("Test shouldSlowDown PASSED.");
        } else {
            System.out.println ("Test shouldSlowDown FAILED.");
        }
    }

    void isMoving() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 50);
        boolean expectedResult = true;
        boolean actualResult = victim.isDriving ();

        if (actualResult == expectedResult) {
            System.out.println ("Test isMoving PASSED.");
        } else {
            System.out.println ("Test isMoving FAILED.");
        }
    }

    void isNotMoving() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 0);
        boolean expectedResult = false;
        boolean actualResult = victim.isDriving ();

        if (actualResult == expectedResult) {
            System.out.println ("Test isNotMoving PASSED.");
        } else {
            System.out.println ("Test isNotMoving FAILED.");
        }
    }

    void mightAccelerate() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 100);
        boolean expectedResult = true;
        boolean actualResult = victim.canAccelerate ();

        if (actualResult == expectedResult) {
            System.out.println ("Test mightAccelerate PASSED.");
        } else {
            System.out.println ("Test mightAccelerate FAILED.");
        }
    }

    void shouldHitMax() {
        Car victim = new Car ("VICTIM", "Yellow", 150, 100);
        int expectedResult = victim.getMaxSpeed ();
        victim.speedUp ();
        int actualResult = victim.getCurrentSpeed ();

        if (actualResult == expectedResult) {
            System.out.println ("Test shouldHitMax PASSED.");
        } else {
            System.out.println ("Test shouldHitMax FAILED.");
        }
    }
}
