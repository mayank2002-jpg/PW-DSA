package Dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //To add data in queue - Enqueue
        for(int i = 0; i<10;i++){
            q.add(i);
        }
        System.out.println("Queue data looks like: " + q);

        //To display top element present in queue
        System.out.println("The top element in the queue before deletion is : " + q.peek());

        //To remove the element from the queue
        q.remove();

        //To display top element present in queue
        System.out.println("The top element in the queue after deletion is : " + q.peek());

        //To Check the size of the queue
        System.out.println("The size of the queue is : " + q.size());

    }
}
