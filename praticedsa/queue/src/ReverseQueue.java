import java.util.*;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        reverseQueue(q);
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        generateNumbersWithGivenDigit(10);
    }

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> sq = new Stack<>();
        while (!q.isEmpty()) {
            sq.push(q.poll());
        }
        while (!sq.isEmpty()) {
            q.offer(sq.pop());
        }
    }

    public static void generateNumbersWithGivenDigit(int x) {
        Queue<String> q = new LinkedList<>();
        q.offer("5");
        q.offer("6");
        for (int i = 0; i < x; i++) {
            String curr = q.peek();
            System.out.println(curr);
            q.poll();
            q.offer(curr+"5");
            q.offer(curr+"6");
        }
    }
}
