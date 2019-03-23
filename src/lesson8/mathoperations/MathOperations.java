package lesson8.mathoperations;

public class MathOperations {

    public void executeAll(MathOperation[]mathOperations, double firstNumber, double secondNumber){

        for ( MathOperation mathOperation : mathOperations){
            System.out.println (mathOperation.toString () + " result is " + mathOperation.execute(firstNumber,secondNumber));

        }

    }

}
