package lesson6;

import lesson3.ICollection;

public interface Tree<E> extends ICollection, Iterable<E> {

    enum TraverseMode{
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }

    boolean find(E value);

    boolean add(E value);

    boolean remove(E value);

    void display();

    boolean isBalanced();

    void traverse(TraverseMode mode);

    int depth(Node node);

    Node getRoot();
}
