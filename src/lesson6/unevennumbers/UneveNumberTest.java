package lesson6.unevennumbers;

public class UneveNumberTest {

    public static void main(String[] args) {
        UnevenNumbers testRunner = new UnevenNumbers ();
        testRunner.printUnevenNumbersWhile (1,50);
        System.out.println ("");
        testRunner.printUnevenNumbersFor (1,50);
        System.out.println ("");
        testRunner.printUnevenNumbersDoWhile (1,50);
    }
}
