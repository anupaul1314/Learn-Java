class Node{
    int data;
    Node next;          // Reference of self type
    Node(int x){       // Constructors
        data = x;
        next = null;
    }
}
public class ImplementationSinglyLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        //head = InsertionAtFirst(head,0);
        //head = deletionFromStart(head);
        //deletionFromEnd(head);
        //insertAtPosition(head,25,3);
        //searchLL(head,30);
        traverseLL(head);
    }

    public static void traverseLL(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data +" ");
            curr =curr.next;      // Its like i++
        }
    }

    public static Node InsertionAtFirst(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertionAtENd(Node head, int data){
        Node endNode = new Node(data);
        if (head == null){
            return endNode;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = endNode;
        return head;
    }


    public static Node deletionFromStart(Node head){
        if (head == null){
            return null;
        }
        else{
            return head.next;
        }
    }

    public static Node deletionFromEnd(Node head){
        if (head == null){return null;}
        if (head.next == null){return null;}
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return curr;
    }

    public static Node insertAtPosition(Node head, int data, int pos){
        Node addNode = new Node(data);
        if (pos==1){
            addNode.next = head;
            return addNode;
        }
        Node current = head;
        for (int i =1; i<pos-1; i++){
            if (current == null) {
                return head;
            }
            current = current.next;
        }
        if (current==null){
            return head;
        }
        addNode.next = current.next;
        current.next = addNode;
        return head;
    }

    public static int searchLL(Node head, int x){
        int pos = 1;
        Node curr = head;
        while (curr!=null){
            if (curr.data==x){
                System.out.println(pos);
                return pos;
            }
            else {
                pos++;
                curr = curr.next;
            }
        }
        System.out.println(-1);
        return -1;
    }
}


