package lesson8.shape;

abstract class AbstractShape implements Shape {

    String name;
    static double piNumber = 3.14;

    AbstractShape(String name) {
        this.name = name;
    }

}
