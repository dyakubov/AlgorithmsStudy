package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExponentiationTest {
    private Exponentiation exp = new Exponentiation();

    @Test
    void test(){
        Assertions.assertEquals(8, exp.getExp(2, 3));
        Assertions.assertEquals(0.125, exp.getExp(2, -3));
        Assertions.assertEquals(1, exp.getExp(2, 0));
        Assertions.assertEquals(0, exp.getExp(0, 2));
        Assertions.assertEquals(-8, exp.getExp(-2, 3));
    }
}