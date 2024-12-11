import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_1st_Kelement {
    public static void reverseFirstK(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) {
            System.out.println("Invalid input");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push the first K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        // Step 2: Add the stack elements back to the queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Step 3: Move the remaining elements (size - K) to the back of the queue
        int remainingSize = q.size() - k;
        for (int i = 0; i < remainingSize; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;

        System.out.println("Original Queue: " + q);
        reverseFirstK(q, k);
        System.out.println("Queue after reversing first " + k + " elements: " + q);
    }
}
