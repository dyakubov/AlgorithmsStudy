package lesson3.stack;

import lesson3.ICollection;

public interface Stack<E> extends ICollection {

    void push(E value);

    E pop();

    E peek();

}