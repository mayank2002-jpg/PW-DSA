package Dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //TC - O(n)
    //Add new element in stack
    static void add(int data){
        //1. Move all the elements from q1 to q2
        while (!q1.isEmpty()){
            q2.add(q1.peek());
            //Poll method is used to remove the element from the queue
            q1.poll();
        }
        //2. Push the new data to q1
        q1.add(data);

        //Move back all elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    //To delete element from the stack
    //TC - O(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Stack overflow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }


    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();

        //push all elements in stack
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);

        //pop all elements from the stack
        System.out.println("Deleted element from the stack  is : " + s.remove());
    }
}
