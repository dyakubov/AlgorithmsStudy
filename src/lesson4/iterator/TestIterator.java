package lesson4.iterator;

import lesson4.linkedlist.LinkedList;
import lesson4.linkedlist.SimpleLinkedList;

public class TestIterator {

    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedList<>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        System.out.println(list.toString());

        for (int i : list) {
            doAction(i);
        }

    }

    private static void doAction(int value) {
        System.out.println(value);
    }
}
