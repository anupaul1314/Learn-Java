
class Node {
    int data;
    Node next;   // Reference of self type
    Node(int x ){  // Constructors
        data = x;
        next = null;
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
    }
}
