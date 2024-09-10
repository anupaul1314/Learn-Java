import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithQueueOperation {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int x) {
        queue2.offer(x);

        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        System.out.println(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.poll();
    }

    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
    }

    public int size() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.size();
    }
    public static void main(String[] args) {

        StackWithQueueOperation stack = new StackWithQueueOperation();
        stack.push(10);
        stack.push(20);
        stack.push(30);

    }
}

