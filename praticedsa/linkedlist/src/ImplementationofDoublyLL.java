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
        head.prev = head;
        second.next = third;
        third.prev = second;
        //head = insertionAtStart(head,0);
        head = insertionAtEnd(head,40);
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
}
