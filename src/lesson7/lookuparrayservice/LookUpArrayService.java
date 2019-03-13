package lesson7.lookuparrayservice;


public class LookUpArrayService {

    private int result;

    int findMax(int[] array) {

        int max = Integer.MIN_VALUE;
        if (array.length == 0) {
            max = 0;
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }
        result = max;
        return result;
    }

    int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array.length == 0) {
            min = 0;
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        result = min;
        return result;
    }

    int indexOfMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int k = 0;
        if (array.length == 0) {
            min = 0;
            k = -1;
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] == min) {
                k = i;
            }
        }
        result = k;
        return result;
    }

    int indexOfMax(int[] array) {

        int max = Integer.MIN_VALUE;
        int k = 0;
        if (array.length == 0) {
            max = 0;
            k = -1;
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] == max) {
                k = i;
            }

        }
        result = k;
        return result;
    }

    void printValues() {
        System.out.println (result);
    }


}
