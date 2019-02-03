package RandomNumberServiceTest;
import java.util.Random;

public class RandomNumberServiceTest {

    public static void main(String[] args) {
        Random randomGenerator = new Random ();
        int firstRandomNumber = randomGenerator.nextInt (11);
        int secondRandomNumber = randomGenerator.nextInt (11);
        int thirdRandomNumber = randomGenerator.nextInt (11);
        int sumOfRandomNumbers = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

            System.out.println ("We generated three random numbers within range from 1 to 10");
            System.out.println ("They are: " + firstRandomNumber + "; " + secondRandomNumber + "; " + thirdRandomNumber + ";");
            System.out.println ("The sum of these three numbers is: " + sumOfRandomNumbers);
        }
    }



