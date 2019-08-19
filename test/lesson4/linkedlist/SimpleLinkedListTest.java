package lesson4.linkedlist;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleLinkedListTest {

    private LinkedList<Integer> list = new SimpleLinkedList<>();

    @BeforeEach
    private void prepare(){

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

    }

    @Test
    void insertFirst() {
        list.insertFirst(7);
        Assertions.assertEquals("7 6 5 4 3 2 1", list.toString());
    }

    @Test
    void removeFirst() {
        list.removeFirst();
        Assertions.assertEquals("5 4 3 2 1", list.toString());
    }

    @Test
    void remove() {
        list.remove(4);
        Assertions.assertEquals("6 5 3 2 1", list.toString());
    }

    @Test
    void contains() {
        Assertions.assertTrue(list.contains(2));
        Assertions.assertFalse(list.contains(10));
    }

    @Test
    @Ignore
    void display() {
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    @Ignore
    void isFull() {
    }

    @Test
    void size() {
        Assertions.assertEquals(6, list.size());
    }

    @Test
    void getFirstValue() {
        Assertions.assertEquals(6, list.getFirstValue());
    }

    @Test
    @Ignore
    void iterator() {
    }
}