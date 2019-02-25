package lesson3.human;

public class Human {

    private String name;
    private int age;

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

    public void sayHi(){
        System.out.println ("Hi! My name is " + getName () + ". I`m " + getAge () + " years old.");
    }
}
