package signcomparator;

public class SignCimparatorTest {
    public static void main(String[] args) {
        SignComparator signComparator = new SignComparator ();
        signComparator.numberOne = 5;
        signComparator.numberTwo = -5;
        signComparator.numberThree = 0;
        signComparator.compare ();
    }

}
