package lesson6.powercalculator;

public class PowerCalculator {

    void pow(long number, long power) {

        long result = 1;
        System.out.println (number + " raised to the power of " + power);

        while (power > 0) {
            result = number * result;
            power--;
        }

        System.out.println ("equals: " + result);
    }

}
