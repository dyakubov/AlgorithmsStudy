package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowTest {

    @Test
    void test(){

        Assertions.assertEquals(8, MyPow.pow(2, 3));
        Assertions.assertEquals(0.125, MyPow.pow(2, -3));
        Assertions.assertEquals(1, MyPow.pow(2, 0));
        Assertions.assertEquals(0, MyPow.pow(0, 2));
        Assertions.assertEquals(-8, MyPow.pow(-2, 3));

    }
}