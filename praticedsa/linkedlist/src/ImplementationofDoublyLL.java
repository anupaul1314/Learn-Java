class NewNode{
    int data;
    NewNode prev;
    NewNode next;
    NewNode(int d){
        data = d;
        prev = null;
        next = null;
    }
}

public class ImplementationofDoublyLL {
    public static void main(String[] args) {
        NewNode head = new NewNode(10);
        NewNode second = new NewNode(20);
        NewNode third = new NewNode(30);

        head.next = second;
        head.prev = null;
        second.next = third;
        second.prev = head;
        third.next = null;
        third.prev = second;
        //head = insertionAtStart(head,0);
        //head = insertionAtEnd(head,40);
        //head = reverseLL(head);
        //head = deleteHeadNode(head);
        //head = deleteLastNode(head);
        traverseLL(head);
    }

    public static void traverseLL(NewNode head){
        NewNode current = head;
        while (current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static NewNode insertionAtStart(NewNode head, int data){
        NewNode insert = new NewNode(data);
        if (head!=null){
            insert.next = head;
            head.prev = insert;
        }
        head = insert;
        return head;
    }

    public static NewNode insertionAtEnd(NewNode head, int data){
        NewNode end = new NewNode(data);
        if (head==null){
            return end;
        }
        NewNode curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = end;
        end.prev = curr;
        return head;
    }

    public static NewNode reverseLL(NewNode head){
        if(head==null || head.next==null){return head;}
        NewNode prev = null;
        NewNode next = null;
        NewNode curr = head;
        while (curr!=null){
            next = curr.next;
            curr.next = curr.prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static NewNode deleteHeadNode(NewNode head){
        if (head == null || head.next == null ){return null;}

        head = head.next;
        head.prev = null;

        return head;
    }

    public static NewNode deleteLastNode(NewNode head){
        if (head==null || head.next==null){return null;}
        NewNode curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
}