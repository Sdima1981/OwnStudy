package lesson5.tv;

public class TVTest {

    public static void main(String[] args) {
        TVTest testRun = new TVTest ();

        testRun.shouldBeSecondChannel ();
        testRun.shouldBeZeroChannel ();

    }

    private void shouldBeSecondChannel() {
        TV victimOne = new TV ("VictimOne", 0, 0, false);
        int expectedResult = 2;

        victimOne.tunrOn ();
        victimOne.nextChannel ();
        victimOne.nextChannel ();

        int actualResult = victimOne.getCurrentChannel ();
        if (expectedResult == actualResult) {
            System.out.println ("Test shouldBeSecondChannel PASSED");
            System.out.println (victimOne);
        } else {
            System.out.println ("Test shouldBeSecondChannel FAILED");
        }
    }

    private void shouldBeZeroChannel() {
        TV victimTwo = new TV ("VictimTwo", 1, 0, true);
        int expectedResult = 0;
        victimTwo.previousChannel ();
        victimTwo.previousChannel ();
        int actualResult = victimTwo.getCurrentChannel ();
        if (expectedResult == actualResult) {
            System.out.println ("Test shouldBeZeroChannel PASSED");
            System.out.println (victimTwo);
        } else {
            System.out.println ("Test shouldBeZeroChannel FAILED");
            System.out.println (victimTwo);
        }
    }


}
