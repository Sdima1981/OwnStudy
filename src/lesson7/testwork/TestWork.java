package lesson7.testwork;

import java.util.Random;

public class TestWork {

    private int[] array = new int[10];
    private int[] userArray = new int[]{};
    private int temp = 0;
    private int from;
    private int to;

    public void setBounds(int from, int to) {

        this.from = from;
        this.to = to;

        fillArrayWithRandomNumbers ();
        createUserArray ();
        fillNewArrayWithinUserBounds ();
        arrayToConsole (array);
        arrayToConsole (userArray);
    }

    void fillArrayWithRandomNumbers() {
        Random random = new Random ();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt (101);
        }
    }

    void createUserArray() {
        int k = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > from && array[i] < to) {
                k++;
            }
        }
        int[] temp = new int[k];
        userArray = temp;
    }

    int[] fillNewArrayWithinUserBounds() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] > from && array[i] < to) {
                userArray[temp] = array[i];
            } else {
                continue;
            }
            temp++;
        }
        return userArray;
    }

    void arrayToConsole(int[] array) {
        for (int element : array) {
            System.out.print (element + " ");

        }
        System.out.println (" ");
    }


}
