
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
        size++;
    }

    void deque(int data) {
        if (isEmpty()) {
            return;
        }
        for (int i=0; i<arr.size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        }else {
            return 0;
        }
    }

    int getRear() {
        if (isEmpty()) {
            return -1;
        }else {
            return size-1;
        }
    }
}

