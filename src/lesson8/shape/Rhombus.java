package lesson8.shape;

public class Rhombus extends AbstractShape {

    private double diagonallyA;
    private double diagonallyB;

    Rhombus(String name, double diagonallyA, double diagonallyB){
        super(name);
        this.diagonallyA = diagonallyA;
        this.diagonallyB = diagonallyB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        if(diagonallyA > 0 && diagonallyB > 0){
            return (diagonallyA * diagonallyB) / 2;
        }
        return 0;
    }
}
