package lesson7.palindrome;

import java.util.Arrays;

public class Palindrome {

    private String word;
    char[]string = new char[]{};

    void setWord(String word) {
        this.word = word;
    }

    char[]stringToArray(){
        string = word.toCharArray ();
        return string;
    }

    boolean isPalindrome() {

        if (Arrays.equals (stringToArray (), swapArray (stringToArray ()))){
            return true;
        } else {
            return false;
        }
    }

    char[] swapArray(char[] array) {

        char[] swappedArray = new char[]{};
        int max = array.length - 1;
        int min = 0;

        if ((array.length) % 2 == 0) {
            while (max > array.length / 2) {

                char temp1;
                char temp2;
                temp1 = array[min];
                temp2 = array[max];
                array[max] = temp1;
                array[min] = temp2;
                max--;
                min++;
            }
        } else {
            while (min < array.length / 2) {

                char temp1;
                char temp2;
                temp1 = array[min];
                temp2 = array[max];
                array[max] = temp1;
                array[min] = temp2;
                max--;
                ++min;
            }

        }
        swappedArray = array;

        return swappedArray;

    }

}
