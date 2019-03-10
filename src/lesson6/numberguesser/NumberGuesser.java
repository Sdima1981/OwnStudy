package lesson6.numberguesser;

import java.util.Scanner;

 class NumberGuesser {
   private int iMax = 100;
   private int i = 100;
   private String sign;
   private int iMin = 0;
   private int userNumber;


    private int getI() {
        return i;
    }

    private int getUserNumber() {
        return userNumber;
    }


    private String getSign() {
        return sign;
    }


    void numberGame() {

        while (!isUserNumber()) {

            inputSign ();

            if (getSign ().equals ("<")) {
                numberIsSmaller ();
            } else {
               numberIsGreater ();
            }
        }
    }

    void numberIsSmaller(){
        if(i > iMax){
            iMax = i;
        }
        if(i< iMin){
            iMin = i;
        }

        if(iMax - iMin <= 7){
            i = i + 1;
        } else{

            i = iMax/2;}


        iMax = i;
    }

    void numberIsGreater(){
        if(i > iMax){
            iMax = i;
        }
        if(i< iMin){
            iMin = i;
        }
        if(iMax - iMin <= 7){
            i = i + 1;
        }
     //   iMax = i;
     //   i = iMax/2;
     //   iMin = i;
        i = iMin * 6 / 5;
    }

    private boolean isUserNumber() {
        if (getUserNumber () == i) {
            System.out.println ("Your number is " + i);

            return true;

        } else {
            return false;

        }
    }

    private void inputSign() {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("If num is less, than" + getI () + "press <");
        System.out.println ("If num is greater, than" + getI () + "press >");
        sign = scanner.next ();
     //   scanner.close ();

    }


}
