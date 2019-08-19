package lesson3.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueImplTest {

    private QueueImpl<Integer> queue;

    @BeforeEach
    public void prepare(){
        queue = new QueueImpl<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
    }

    @Test
    void insert() {
        Assertions.assertEquals("[1, 2, 3, 4, 5]", queue.toString());
        queue.remove();
        queue.insert(6);
        Assertions.assertEquals("[6, 2, 3, 4, 5]", queue.toString());

    }

    @Test
    void remove() {
        Assertions.assertEquals(1, queue.remove());
    }

    @Test
    void peek() {
        Assertions.assertEquals(1, queue.peek());
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    void size() {
        Assertions.assertEquals(5, queue.size);
    }

    @Test
    void isFull() {
        Assertions.assertTrue(queue.isFull());
        queue.remove();
        Assertions.assertFalse(queue.isFull());
        queue.insert(2);
        Assertions.assertTrue(queue.isFull());
    }
}