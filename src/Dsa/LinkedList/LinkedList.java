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

    //Implementation of deletion of nodes in the linked list
    void deleteNode(int position) {
        //LinkedList empty
        if (head == null) {
            return;
        }
        Node temp = head;
        //Deletion from beginning
        if (position == 0) {
            head = temp.next;
            return;
        }
        //Deletion from other position  apart from beginning
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    //Implementation of reversal node of LinkedList(Iteratively)
    public void reversal() {
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        head = prev;
        return;
    }

    //Implementation of reversal node of linked List(recursively)
    public void reversalRec(Node curr, Node prev) {
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextptr = curr.next;
        curr.next = prev;
        //recursive function call
        reversalRec(nextptr, curr);
    }

    //Implementation of finding middle node of linked list
    public void middleNode() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The middle node of linked list is: " + slow.data);
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
//        llist.deleteNode(2);
//        System.out.println("Linked List after deletion of node: ");
//        llist.printNodes();
//        System.out.println();

//        llist.reversal();
//        System.out.println("Reversal in a Linked List: ");
//        llist.printNodes();
//        System.out.println();


//        llist.reversalRec(llist.head, null);
//        System.out.println("Reversal of linked list using recursion: ");
//        llist.printNodes();
//        System.out.println();

        llist.middleNode();
        System.out.println();
    }
}
