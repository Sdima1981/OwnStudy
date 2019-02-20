package signcomparator;

public class SignCimparatorTest {
    public static void main(String[] args) {
        SignCimparatorTest testRunner = new SignCimparatorTest ();
        testRunner.shouldBeZero ();
        testRunner.shouldBeNegative ();
        testRunner.shouldBePositive ();
    }

    public void shouldBeZero() {
        SignComparator victim = new SignComparator ();
        String expectedResult = "Number is equal to zero";
        String actualResult = victim.compare (0);

        if (expectedResult.equals (actualResult)) {
            System.out.println ("shouldBeZero: SUCCESS");
        } else {
            System.out.println ("shouldBeZero: FAIL");
        }
    }

    public void shouldBeNegative() {
        SignComparator victim = new SignComparator ();
        String expectedResult = "Number is negative";
        String actualResult = victim.compare (-5);

        if (expectedResult.equals (actualResult)) {
            System.out.println ("shouldNegative: SUCCESS");
        } else {
            System.out.println ("shouldNegative: FAIL");
        }
    }

    public void shouldBePositive() {
        SignComparator victim = new SignComparator ();
        String expectedResult = "Number is positive";
        String actualResult = victim.compare (5);

        if (expectedResult.equals (actualResult)) {
            System.out.println ("shouldBePositive: SUCCESS");
        } else {
            System.out.println ("shouldBePositive: FAIL");
        }
    }

}
