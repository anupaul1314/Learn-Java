
public class LLQueue {
    Node front;
    Node rear;
    LLQueue() {
        front = rear = null;
    }
   public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front==null) {
            front = rear = newNode;
            rear.next = newNode;
            rear = newNode;
            System.out.println(newNode);
        }
    }

   public void dequeue(int data) {
        if (front == null) return;
        front = front.next;
        if (front == null) rear = null;
    }
}

class Node {
    Node next;
    int element;
    Node(int data) {
        element = data;
        next = null;
    }
}

class Operations {
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
    }
}


