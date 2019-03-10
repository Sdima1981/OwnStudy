package lesson6.unevennumbers;

public class UneveNumberTest {

    public static void main(String[] args) {
        UnevenNumbers testRunner = new UnevenNumbers ();
        System.out.println ("All Uneven numbers in range from 1 to 50, using 'While' method are: " );
        testRunner.printUnevenNumbersWhile (1,50);
        System.out.println ("");
        System.out.println ("All Uneven numbers in range from 1 to 50, using 'For' method are: " );
        testRunner.printUnevenNumbersFor (1,50);
        System.out.println ("");
        System.out.println ("All Uneven numbers in range from 1 to 50, using 'Do While' method are: " );
        testRunner.printUnevenNumbersDoWhile (1,50);
    }
}
