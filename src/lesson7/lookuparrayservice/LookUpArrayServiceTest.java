package lesson7.lookuparrayservice;

public class LookUpArrayServiceTest {

    public static void main(String[] args) {
        LookUpArrayServiceTest testRunner = new LookUpArrayServiceTest ();

        testRunner.findMaxTest ();
        testRunner.findMaxNoArrayTest ();
        testRunner.findMinTest ();
        testRunner.findMinNoArrayTest ();
        testRunner.indexOfMaxTest ();
        testRunner.indexOfMaxTestNoArray ();
        testRunner.indexOfMinTest ();
        testRunner.indexOfMinTestNoArray ();
    }


    void findMaxTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {1, 3, 4, -2, 667, 7};
        int expectedResult = 667;
        int actualResult = victim.findMax (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test findMaxTest");
        } else System.out.println ("FAILED Test findMaxTest:");
    }

    void findMaxNoArrayTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {};
        int expectedResult = 0;
        int actualResult = victim.findMax (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test findMaxNoArrayTest");
        } else System.out.println ("FAILED Test findMaxNoArrayTest");
    }

    void findMinTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {1, 3, 4, -2, 667, 7};
        int expectedResult = -2;
        int actualResult = victim.findMin (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test findMaxTest");
        } else System.out.println ("FAILED Test findMaxTest");
    }

    void findMinNoArrayTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {};
        int expectedResult = 0;
        int actualResult = victim.findMin (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test findMinNoArrayTest");
        } else System.out.println ("FAILED Test findMinNoArrayTest");
    }

    void indexOfMaxTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {1, 3, 4, -2, 667, 7};
        int expectedResult = 4;
        int actualResult = victim.indexOfMax (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test indexOfMaxTest");
        } else System.out.println ("FAILED Test indexOfMaxTest:");
    }

    void indexOfMaxTestNoArray() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {};
        int expectedResult = -1;
        int actualResult = victim.indexOfMax (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test indexOfMaxTestNoArray");
        } else System.out.println ("FAILED Test indexOfMaxTestNoArray:" + actualResult);
    }

    void indexOfMinTest() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {1, 3, 4, -2, 667, 7};
        int expectedResult = 3;
        int actualResult = victim.indexOfMin (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test indexOfMinTest");
        } else System.out.println ("FAILED Test indexOfMinTest:");
    }

    void indexOfMinTestNoArray() {
        LookUpArrayService victim = new LookUpArrayService ();
        int[] victimArray = {};
        int expectedResult = -1;
        int actualResult = victim.indexOfMin (victimArray);
        if (expectedResult == actualResult) {
            System.out.println ("PASSED Test indexOfMinTestNoArray");
        } else System.out.println ("FAILED Test indexOfMinTestNoArray:");
    }


}





