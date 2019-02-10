/*Напишите программу на Java, которая выводит в консоль сообщение -
        является ли число положительным или отрицательным.
        Программа должна состоять из следующих классов:
        1) SignComparator - класс с одним методом compare(),
        который в качестве параметра принимает целое число (int) и
        возвращает текстовый (String) результат:
        "Number is positive", если число положительное;
        "Number is negative", если число отрицательное;
        "Number is equal to zero", если число равно 0;
        2) SignComparatorTest - класс, в котором необходимо продемонстрировать
        работу с классом SignComparator:

        Вывести в консоль сообщение с числом и его типом (напр. "123: Number is positive")
        Написать тесты, в которых проверяется ожидаемый и
        полученный результат работы метода (см. презентацию).
        Проверить разные сценарии, когда данные совпадают и не совпадают.*/
package signcomparator;

public class SignComparator {
    int numberOne;
    int numberTwo;
    int numberThree;
    private int startNumber = 0;

    public int getNumberOne() {
        return numberOne;

    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }public void setNumberTwo (int numberTwo) {this.numberTwo = numberTwo;}

    public int getNumberThree (){
        return numberThree;
    }public void setNumberThree(int numberThree){ this.numberThree = numberThree;}

    void compare(){
        if (numberOne > startNumber){
            System.out.println ("Number: " + numberOne + " is positive");
        }else if (numberOne == startNumber){
            System.out.println ("Number: " + numberOne + " is equal to zero");
        }else {
            System.out.println ("Number: " + numberOne + " is negative");
        }

        if (numberTwo > startNumber){
            System.out.println ("Number: " + numberTwo + " is positive");
        }else if (numberTwo == startNumber){
            System.out.println ("Number: " + numberTwo + " is equal to zero");
        }else {
            System.out.println ("Number: " + numberTwo + " is negative");
        }

        if (numberThree > startNumber){
            System.out.println ("Number: " + numberThree + " is positive");
        }else if (numberThree == startNumber){
            System.out.println ("Number: " + numberThree + " is equal to zero");
        }else {
            System.out.println ("Number: " + numberThree + " is negative");
        }
    }
}




