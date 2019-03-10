package lesson6.primenumberssum;

class PrimeNumberSum {

    void primeNumberSum(int from, int to) {

        int result = 0;
        int counter = 0;

        while (from <= to) {
            if ((from != 17) && (from != 71) && isPrimeNumber (from)) {
                result = result + from;
                counter = ++counter;
            }
            if (counter < 50) {
                from++;
            } else {
                break;
            }

        }

        System.out.println ("The SUM of all Prime numbers in range grom 1 to 500 is " + result);
        System.out.println ("The total count of all Primes in this range is " + counter);
    }

    private boolean isPrimeNumber(int from) {

        if (from == 1) {
            return false;
        }

        for (int i = 2; i < from; i++) {
            if (from % i == 0) {
                return false;
            }

        }

        return true;

    }
}
