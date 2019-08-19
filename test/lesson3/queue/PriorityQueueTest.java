package lesson3.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    private PriorityQueue<Integer> queue;

    @BeforeEach
    public void prepare(){
        queue = new PriorityQueue<Integer>(5);
        queue.insert(1);
        queue.insert(4);
        queue.insert(2);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
    }

    @Test
    void insert() {
        Assertions.assertEquals("[6, 4, 3, 2, 1]", queue.toString());
        queue.remove();
        queue.insert(6);
        Assertions.assertEquals("[6, 6, 4, 3, 2]", queue.toString());
    }

    @Test
    void remove() {
        Assertions.assertEquals(1, queue.remove());
    }

    @Test
    void peek() {
        Assertions.assertEquals(1, queue.peek());
    }
}