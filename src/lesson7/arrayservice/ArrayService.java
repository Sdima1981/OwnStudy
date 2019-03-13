package lesson7.arrayservice;

import java.util.Random;

public class ArrayService {


    int [] create(int n){
        return new int[n];
    }

    void fillArrayWithRandomNumbers(int[]array){
        Random random = new Random ();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt (101);
        }
    }

    void printArrayToConsole(int[]array){
        for(int element : array){
            System.out.print (element + " ");
        }
        System.out.println (" ");
    }

    private int sum = 0;

    int getSum() {
        return sum;
    }

    int sumInArray(int[]array){
        for (int element:array) {
            sum += element;
        }
        return sum;
    }

    void sortArray(int[]array){
        for(int i = 0; i < array.length; i++){

            for (int k = 0; k < array.length; k++){
                if (array[i] < array[k]){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }

    void swapArray(int[]array){
        int max = array.length - 1;
        int min = 0;

        if ((array.length) % 2 == 0) {
            while (max > array.length / 2) {

                int temp1;
                int temp2;
                temp1 = array[min];
                temp2 = array[max];
                array[max] = temp1;
                array[min] = temp2;
                max--;
                min++;
            }
        } else {
            while (min < array.length / 2) {

                int temp1;
                int temp2;
                temp1 = array[min];
                temp2 = array[max];
                array[max] = temp1;
                array[min] = temp2;
                max--;
                ++min;
            }
        }

    }

}
