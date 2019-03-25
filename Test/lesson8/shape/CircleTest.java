package lesson8.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest  {

    @Test
    void getArea() {
        Circle test = new Circle ("circle", 2);
        assertEquals (12.56,test.getArea () );
    }

}


