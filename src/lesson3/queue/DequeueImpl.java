package lesson3.queue;

public class DequeueImpl <E> extends QueueImpl<E> implements Dequeue<E> {

    public DequeueImpl(int maxCapacity) {
        super(maxCapacity);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull())
            return false;

        if (head == 0){
            head = data.length;
        }

        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return insert(value);
    }

    @Override
    public E removeLeft() {
        return remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty())
            return null;

//        if (tail == 0) {
//            tail = data.length;
//        }

        E value = data[tail--];
        size--;
        return value;
    }
}