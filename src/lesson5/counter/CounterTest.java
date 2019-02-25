package lesson5.counter;

public class CounterTest {

    public static void main(String[] args) {
        CounterTest testRunner = new CounterTest ();
        testRunner.valueShouldBe4 ();
        testRunner.decrementTest ();
        testRunner.incrementTest ();
        testRunner.example ();

    }

    void valueShouldBe4(){

        Counter victim = new Counter ();
        int expectedResult = 4;
        victim.setStep (2);
        victim.increment ();
        victim.increment ();
        int actualResult = victim.getValue ();

        if(actualResult == expectedResult){
            System.out.println ("valueShouldBe4 PASSED");
        }
        else {
            System.out.println ("valueShouldBe4 FAILED");
        }
    }

    void incrementTest(){
        Counter victim = new Counter ();
        int expectedResult = 1;
        victim.setStep (1);
        victim.increment ();
        int actualResult = victim.getValue ();

        if(actualResult == expectedResult){
            System.out.println ("incrementTest PASSED");
        }
        else {
            System.out.println ("incrementTest FAILED");
        }
    }

    void decrementTest(){
        Counter victim = new Counter ();
        int expectedResult = 0; //should be -1
        victim.setStep (1);
        victim.decrement ();
        int actualResult = victim.getValue ();

        if(actualResult == expectedResult){
            System.out.println ("decrementTest PASSED");
        }
        else {
            System.out.println ("decrementTest FAILED");
        }
    }









    void example() {
        Counter counter = new Counter ();

        counter.getValue ();
        counter.getStep ();

        System.out.println ("We are getting default values: " + counter);

        counter.increment ();
        counter.getValue ();
        System.out.println ("Running increment method once: " + counter);

        counter.setStep (3);
        counter.increment ();
        counter.getValue ();
        System.out.println ("Setting step to 3 & running " +
                "increment once: " + counter);

        counter.setStep (2);
        counter.decrement ();
        counter.getValue ();
        System.out.println ("Setting step to 2 & running" +
                "decrement once: " + counter);


        counter.clear ();
        counter.getValue ();
        System.out.println ("Resetting to default values: " + counter);

        counter.setValue (50);
        counter.getValue ();
        System.out.println ("Setting value to 50: " + counter);
    }
}
