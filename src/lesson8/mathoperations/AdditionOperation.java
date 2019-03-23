package lesson8.mathoperations;

public class AdditionOperation implements MathOperation {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String toString() {
        return "AdditionOperation";
    }
}
