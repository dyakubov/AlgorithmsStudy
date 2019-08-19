package lesson4.linkedlist;

import java.util.Iterator;

public class SimpleLinkedList<E> implements LinkedList<E> {

    protected Entry<E> firstElement;
    protected int size;

    //O(1)
    @Override
    public void insertFirst(E value) {
        Entry<E> entry = new Entry<>(value);
        entry.next = firstElement;
        firstElement = entry;
        size++;
    }

    //O(1)
    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;

        E value = firstElement.value;
        firstElement = firstElement.next;

        size--;
        return value;
    }

    //O(N)
    @Override
    public boolean remove(E value) {
        Entry<E> previous = null;
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value))
                break;

            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == firstElement) {
            firstElement = current.next;
        } else {
            previous.next = current.next;
        }

        size--;
        return true;
    }

    //O(N)
    @Override
    public boolean contains(E value) {
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value))
                return true;
            else
                current = current.next;
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("----------");
        Entry<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("----------");

    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getFirstValue() {
        return firstElement != null ? firstElement.value : null;
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleLinkedListIterator();
    }

    public class SimpleLinkedListIterator implements Iterator<E> {
        private Entry<E> current = firstElement;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()){
                return null;
            }
            E value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (E value : this) {
            stringBuilder.append(value).append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}