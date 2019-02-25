package lesson3.dog;

public class Dog {
    private int age;
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println ("I need something to eat!!!");

    }

    public void sleep() {
        System.out.println ("Let me go to sleep now!!!");

    }

    public void voice() {
        System.out.println ("Bark Bark Bark!!!");
    }

    public void printInformation() {
        System.out.println ("My dogs name is " + name);
        System.out.println ("My dogs age is " + age);
        System.out.println ("My dogs color is " + color);

    }

}
