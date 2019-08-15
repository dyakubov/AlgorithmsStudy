package lesson3;

import lesson3.stack.StackImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTextTest {

    @Test
    void reverse() {
        Assertions.assertEquals("5 4 3 2 1", new ReverseText("1 2 3 4 5").reverse());
    }
}