package lesson6.unevennumbers;

public class UnevenNumbers {


    void printUnevenNumbersWhile(int from, int to) {

        while (from < to) {

            if (from % 2 != 0) {
                System.out.print (from);

            }
            from++;
        }
    }

    void printUnevenNumbersFor(int from, int to) {
        for (from = 0; from < to; from++) {
            if (from % 2 != 0) {
                System.out.print (from);

            }
        }
    }

    void printUnevenNumbersDoWhile(int from, int to){
        do{
            if(from%2 != 0){
            System.out.print (from);
            }
            from++;
        }while (from < to);
    }
}
