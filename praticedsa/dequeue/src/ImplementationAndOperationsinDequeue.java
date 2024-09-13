import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementationAndOperationsinDequeue {
}

class DequeueWithArrary {
    int cap;
    int size;
    int[] arr;
    DequeueWithArrary (int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    void insertFront (int element) {
        if (arr.length > cap) return;
        for (int i=0; i<arr.length; i++)
            arr[i+1] = arr[i];
        arr[0] = element;
        size++;
    }

    void insertRear (int element) {
        if (arr.length > cap) return;
        arr[size] = element;
        size++;
    }

    void deleteFront () {
        if (arr.length == 0) return;
        for (int i=0; i<size-1; i++)
            arr[i] = arr[i+1];
        size--;
    }

    void deleteRear () {
        if (arr.length == 0) return;
        size--;
    }
}

class ArrayImplementation {

}
