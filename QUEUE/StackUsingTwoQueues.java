import java.util.Queue;
import java.util.LinkedList;

public class StackUsingTwoQueues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push an element onto the stack
        public static void push(int data) {
            // Always push the new element into q2
            q2.add(data);

            // Transfer all elements from q1 to q2 to maintain stack order
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Swap q1 and q2 to make q1 the primary queue
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop an element from the stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // Peek the top element of the stack
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Demonstrate stack operations
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Top element: " + stack.peek()); // Should print 4
        System.out.println("Popped element: " + stack.pop()); // Should remove and print 4

        System.out.println("Top element after pop: " + stack.peek()); // Should print 3
        stack.push(5);
        System.out.println("Top element after push: " + stack.peek()); // Should print 5

        // Empty the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
    }
}
