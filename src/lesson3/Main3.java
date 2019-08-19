package lesson3;

import lesson3.queue.Dequeue;
import lesson3.queue.DequeueImpl;

import java.util.ArrayDeque;

public class Main3 {

    public static void main(String[] args) {
        Dequeue<Integer> dequeue = new DequeueImpl<>(5);
        dequeue.insertLeft(1);
        dequeue.insertLeft(2);
        dequeue.insertLeft(3);
        dequeue.insertLeft(4);
        dequeue.insertLeft(5);

        while (!dequeue.isEmpty()){
            System.out.println(dequeue.removeRight());
        }



//        dequeue.insertRight(5);
//        dequeue.insertRight(4);
//        dequeue.insertRight(3);
//        dequeue.insertRight(2);
//        dequeue.insertRight(1);
//
//        while (!dequeue.isEmpty()){
//            System.out.println(dequeue.removeLeft());
//        }
//
//        dequeue.insertRight(9);
//        dequeue.insertRight(8);
//        dequeue.insertRight(7);
//        dequeue.insertRight(6);
//        dequeue.insertRight(5);
//
//
//        while (!dequeue.isEmpty()){
//            System.out.println(dequeue.removeRight());
//        }



    }
}