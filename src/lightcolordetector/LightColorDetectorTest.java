package lightcolordetector;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetector myColor = new LightColorDetector ();
        myColor.detect (450);
        myColor.printInformation ();

        LightColorDetectorTest testRunner = new LightColorDetectorTest ();
        testRunner.shouldBeViolet ();
        testRunner.shouldBeBlue ();
        testRunner.shouldBeGreen ();
        testRunner.shouldBeYellow ();
        testRunner.shouldBeOrange ();
        testRunner.shouldBeRed ();
        testRunner.shouldBeInvisibleBelowBounds ();
        testRunner.shouldBeInvisibleOverBounds ();


    }

    public void shouldBeViolet() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is Violet";
        String actualResult = victim.detect (400);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeViolet PASSED!");
        } else {
            System.out.println ("Test shouldBeViolet FAILED!");

        }
    }

    public void shouldBeBlue() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is Blue";
        String actualResult = victim.detect (450);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeBlue PASSED!");
        } else {
            System.out.println ("Test shouldBeBlue FAILED!");

        }
    }

    public void shouldBeGreen() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult =  "The light is Green";
        String actualResult = victim.detect (500);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeGreen PASSED!");
        } else {
            System.out.println ("Test shouldBeGreen FAILED!");

        }
    }

    public void shouldBeYellow() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult =  "The light is Yellow";
        String actualResult = victim.detect (500);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeYellow PASSED!");
        } else {
            System.out.println ("Test shouldBeYellow FAILED!");

        }
    }

    public void shouldBeOrange() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is Orange";
        String actualResult = victim.detect (600);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeOrange PASSED!");
        } else {
            System.out.println ("Test shouldBeOrange FAILED!");

        }
    }

    public void shouldBeRed() {
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is Red";
        String actualResult = victim.detect (700);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeRed PASSED!");
        } else {
            System.out.println ("Test shouldBeRed FAILED!");

        }
    }

    public void shouldBeInvisibleBelowBounds(){
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is not visible!";
        String actualResult = victim.detect (300);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeInvisibleBelowBounds PASSED!");
        } else {
            System.out.println ("Test shouldBeInvisibleBelowBounds FAILED!");

        }
    }

    public void shouldBeInvisibleOverBounds(){
        LightColorDetector victim = new LightColorDetector ();
        String expectedResult = "The light is not visible!";
        String actualResult = victim.detect (800);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("Test shouldBeInvisibleOverBounds PASSED!");
        } else {
            System.out.println ("Test shouldBeInvisibleOverBounds FAILED!");

        }
    }

}


