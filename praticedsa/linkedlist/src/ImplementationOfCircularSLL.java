class CircularNode{
    int data;
    CircularNode next;
    CircularNode(int d){
        data = d;
        next = null;
    }
}
public class ImplementationOfCircularSLL {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        head.next = new CircularNode(20);
        head.next.next = new CircularNode(30);
        head.next.next.next = new CircularNode(40);
        head.next.next.next.next = head;
        //head = insertAtStart(head,0);
        traverseLL(head);
    }

    public static void traverseLL(CircularNode head){
        if (head==null){return;}
        CircularNode curr = head;
        do {
            System.out.println(curr.data +" ");
            curr = curr.next;
        }while (curr!=head);
    }

    public static CircularNode insertAtStart(CircularNode head,int data){
        CircularNode newHead = new CircularNode(data);
        if (head==null){newHead.next = newHead;}

        CircularNode curr = head;
        while (curr.next!=head){
            curr =curr.next;
        }
        curr.next = newHead;
        newHead.next = head;

        return newHead;
    }

    public static CircularNode insertAtEnd(CircularNode head, int data){
        CircularNode newH = new CircularNode(data);
        if (head==null){return newH;}
        
    }
}
