package lesson6.numberservice;

class NumberService {

    void sumInRange(int from, int to) {
        int sum = 0;

        if (from < to) {
            while (from <= to) {
                sum = sum + from;
                from++;

            }
            System.out.println (sum);

        } else {
            while (to <= from) {

                sum = sum + to;
                to++;

            }
            System.out.println (sum);

        }
    }

    void getEvenNumberCount(int from, int to) {
        int counter = 0;
        if (from < to) {
            while (from <= to) {
                if (from % 2 == 0) {
                    counter++;
                }
                from++;
            }
            System.out.println (counter);
        } else {
            while (to <= from) {
                if (to % 2 == 0) {
                    counter++;
                }
                to++;
            }
            System.out.println (counter);
        }
    }
}
