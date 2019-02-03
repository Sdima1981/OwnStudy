package MathOperations;

public class MathOperations {

    public static void main(String[] args){

        int firstNumber = 5;
        int secondNumber = 10;
        int sumResult = firstNumber + secondNumber;
        int substractResult = firstNumber - secondNumber;
        double divideResult = firstNumber / (double)secondNumber;
        int multiplyResult = firstNumber * secondNumber;

        System.out.println ("Here are examples of simple math operations:");
        System.out.println (firstNumber + " + " + secondNumber + " = " + sumResult);
        System.out.println (firstNumber + " - " + secondNumber + " = " + substractResult);
        System.out.println (firstNumber + " / " + secondNumber + " = " + divideResult);
        System.out.println (firstNumber + " * " + secondNumber + " = " + multiplyResult);
    }
}
