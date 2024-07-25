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
        head = insertInaSortedLL(head,35);
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
}


