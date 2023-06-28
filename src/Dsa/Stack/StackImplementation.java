package Dsa.Stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        //Push the element in stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        //print top most element in stack
        System.out.println("The top most element in the stack before deletion is : " + stack1.peek());

        //Delete the top element from stack
        stack1.pop();

        //Print the top most element in stack
        System.out.println("The top most element in the stack after deletion : " + stack1.peek());

        //Search element in stack
        // Search function returns -1 when the element is not present in the stack
        System.out.println("The element 4 is present at the position : " + stack1.search(4));

        // Check whether the stack is empty or not
        // empty function returns the boolean value (true/false)
        System.out.println("Is stack empty or not: " + stack1.empty());
    }
}
