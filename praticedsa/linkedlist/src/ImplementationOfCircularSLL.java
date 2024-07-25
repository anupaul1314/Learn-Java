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
        //head = insertAtEnd(head,50);
        //head = deleteFromStart(head);
        head = deleteKthNode(head,2);
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
        if (head==null){
            newH.next = newH;
            return newH;
        }
        CircularNode curr = head;
        while (curr.next!=head){
            curr = curr.next;
        }
        curr.next = newH;
        newH.next = head;
        return head;
    }

    public static CircularNode deleteFromStart(CircularNode head){
        if (head==null){return head;}
        CircularNode curr = head;
        while (curr.next!= head){
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    public static CircularNode deleteKthNode(CircularNode head, int k){
        if (head==null){return head;}
        if (k==1){deleteFromStart(head);}
        CircularNode curr = head;
        for (int i =0; i<k-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
