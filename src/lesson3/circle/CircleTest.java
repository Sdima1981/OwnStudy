package lesson3.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle ();
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Type in radius to calculate circle area here: ");
        myCircle.setRadius (scanner.nextDouble ());
        scanner.close ();

        myCircle.calculateArea ();
    }
}
