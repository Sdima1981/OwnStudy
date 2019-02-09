package circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Circle myCircle = new Circle ();
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Please input desired radius, and press Enter: ");
        myCircle.radius = scanner.nextDouble ();
        scanner.close ();

        myCircle.calculateArea ();
    }
}
