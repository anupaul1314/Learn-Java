public class Queue {
    int size;
    int capacity;
    int[] arr;
    Queue(int c) {
        capacity = c;
        size =0;
        arr = new int[capacity];
    }
     boolean isFull() {
        return size==capacity;
    }
     boolean isEmpty() {
        return size == 0;
    }
     void enque(int data) {
        if (isFull()) {
            return;
        }
        arr[size] = data;
         System.out.println(arr[size]);
        size++;
    }

     void deque(int data) {
        if (isEmpty()) {
            return;
        }
        for (int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }
     void getFront() {
        if (isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(arr[0]);
        }
    }

     void getRear() {
        if (isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(arr[size-1]);
        }
    }

}

class QueueOperatonsinArray {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.deque(10);
        q.getFront();
        q.getRear();
    }
}
