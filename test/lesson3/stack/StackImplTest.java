package lesson3.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {

    private StackImpl<Integer> stack;

    @BeforeEach
    private void prepare(){
        stack = new StackImpl<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

    }

    @Test
    void push() {
        Assertions.assertEquals("[1, 2, 3, 4, 5]", stack.toString());
    }

    @Test
    void pop() {
        Assertions.assertEquals(5, stack.pop());
    }

    @Test
    void peek() {
        Assertions.assertEquals(5, stack.pop());
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    void size() {
        Assertions.assertEquals(5, stack.size());
        stack.pop();
        Assertions.assertEquals(4, stack.size());
    }

    @Test
    void isFull() {
        Assertions.assertTrue(stack.isFull());
    }
}