package Dsa.LinkedList;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //Insert node at very end in the Linked List
    public void insertAtEnd(int newData) {
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        //LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    //Insert node at very beginning in the Linked List
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //Insert node after any node
    public void insertAfter(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("The previous node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }


    // display all the nodes after the insertion
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Function calling
        llist.insertAtBeginning(45);
        llist.insertAtBeginning(55);
        llist.insertAtEnd(2);
        llist.insertAtEnd(20);
        llist.insertAfter(llist.head.next.next, 13);
        System.out.println("LinkedList After successful insertion of all nodes: ");
        llist.printNodes();
        System.out.println();

    }
}
