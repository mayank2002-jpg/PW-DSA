package Dsa.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImp {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addFirst(9);

        System.out.println("Deque output looks like : " + deque);

        deque.removeFirst();
        System.out.println("Deque output looks like after deletion : " + deque);
    }
}
