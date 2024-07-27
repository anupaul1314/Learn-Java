class DoublyCircular{
    int data;
    DoublyCircular prev;
    DoublyCircular next;
    DoublyCircular(int d){
        data = d;
        prev = null;
        next = null;
    }
}

public class ImplementationOfCircularDLL {
    public static void main(String[] args) {
        DoublyCircular head = new DoublyCircular(10);
        DoublyCircular second = new DoublyCircular(20);
        DoublyCircular third = new DoublyCircular(30);
        DoublyCircular fourth = new DoublyCircular(40);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        head.prev = fourth;
        fourth.next = head;
        fourth.prev = third;
        //head = insertAtHead(head,0);
        //head = insertInaSortedLL(head,35);
        //middleNode(head);
        head = reverseLL(head);
        traverse(head);
    }
    public static void traverse(DoublyCircular head){
        DoublyCircular curr = head;
        do {
            System.out.println(curr.data+ " ");
            curr = curr.next;
        }while (curr!=head);
    }

    public static DoublyCircular insertAtHead(DoublyCircular head, int data){
        DoublyCircular newNode = new DoublyCircular(data);
        if (head== null){
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }
        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;
        return newNode;
    }

    public static DoublyCircular insertInaSortedLL(DoublyCircular head, int data){
        DoublyCircular newNode = new DoublyCircular(data);
        if (head==null){return newNode;}
        if (data< head.data){
            newNode.next = head;
            return newNode;
        }
        DoublyCircular curr = head;
        while (curr.next!=null && curr.next.data<data){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static DoublyCircular middleNode(DoublyCircular head){
        if (head==null){return null;}
        DoublyCircular slow = head;
        DoublyCircular fast = head;

        // Using the slow and fast pointer technique to find the middle
        do {
            fast = fast.next;
            if (fast != head) {
                fast = fast.next;
                slow = slow.next;
            }
        } while (fast != head && fast.next != head);

        System.out.println(slow.data);
        return slow;
    }

    public static DoublyCircular reverseLL(DoublyCircular head){
        DoublyCircular cuur = head;
        DoublyCircular prev = null;
        while (cuur!=null){
            DoublyCircular next = cuur.next;
            cuur.next = prev;
            prev = cuur;
            cuur = next;
        }
        return prev;
    }
}


