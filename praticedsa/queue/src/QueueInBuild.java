import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInBuild {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();

        // These does not give me any exception when the queue is null.
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q.poll());
        System.out.println(q.peek());


        // These throw exception
        q.add(10);                          // -> Offer
        System.out.println(q.remove());     // -> Poll
        System.out.println(q.element());    // -> Peek
    }
}
