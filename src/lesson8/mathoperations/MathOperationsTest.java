package lesson8.mathoperations;

public class MathOperationsTest {

    public static void main(String[] args) {

        MathOperation[] operations = {new AdditionOperation (),
                new DeductionOperation (),
                new DivisionOperation (),
                new IncreaseOperation ()};

        MathOperations test = new MathOperations ();
        test.executeAll (operations, 10, 5);
    }
}
