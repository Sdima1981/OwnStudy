package lesson7.arrayservice;


import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest ();

        testRunner.shouldCreateNewArray ();
        testRunner.shouldSumNumbersInArray ();
        testRunner.shouldFillArrayWithRandomNumbers ();
        testRunner.simpleArrayOperations ();
    }

    void shouldCreateNewArray() {
        ArrayService victim = new ArrayService ();
        int[] victimArray;
        victimArray = victim.create (3);
        if (victimArray != null) {
            System.out.println ("PASSED Test shouldCreateNewArray");
        } else {
            System.out.println ("FAILED Test shouldCreateNewArray");
        }
    }

    void shouldSumNumbersInArray() {
        ArrayService victim = new ArrayService ();
        int[] victimArray = new int[]{1, 2, 3};
        int expectedResult = 6;
        int actualResult = victim.sumInArray (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test shouldSumNumbersInArray");
        } else {
            System.out.println ("FAILED Test shouldSumNumbersInArray");
        }

    }

    void shouldFillArrayWithRandomNumbers() {
        ArrayService victim = new ArrayService ();
        int[] actualResult = new int[]{0, 0, 0};
        int[] expectedResult = new int[]{0, 0, 0};
        victim.fillArrayWithRandomNumbers (actualResult);

        if (Arrays.equals (expectedResult, actualResult)) {
            System.out.println ("FAILED Test shouldFillArrayWithRandomNumbers");
        } else {
            System.out.println ("PASSED Test shouldFillArrayWithRandomNumbers");
        }
    }

    void simpleArrayOperations() {
        ArrayService victim = new ArrayService ();
        int[] victimArray = victim.create (10);
        System.out.println ("We`ve created a new array, with name victimArray: ");
        System.out.println (Arrays.toString (victimArray));

        System.out.println ("Filled it with Random numbers within range of 0 to 100: ");
        victim.fillArrayWithRandomNumbers (victimArray);
        victim.printArrayToConsole (victimArray);

        victim.sumInArray (victimArray);
        System.out.println ("The sum of all the numbers in Array equals to: ");
        System.out.println (victim.getSum ());

        victim.sortArray (victimArray);
        System.out.println (Arrays.toString (victimArray));

        victim.swapArray (victimArray);
        System.out.println (Arrays.toString (victimArray));
    }


}

