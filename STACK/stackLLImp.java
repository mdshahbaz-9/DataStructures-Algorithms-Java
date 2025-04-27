// question: Implement a stack using linked list in Java. 
public class stackLLImp {
    // Node class to represent each element in the stack
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack implementation using linked list
    static class Stack {
        Node head = null;

        // Push an element onto the stack
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop an element from the stack
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int poppedData = head.data;
            head = head.next;
            return poppedData;
        }

        // Peek the top element of the stack
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }

        // Display the stack elements
        void display() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();  // Create a Stack instance directly

        stack.push(10);
        stack.push(20);
        stack.push(30);
        

        System.out.println("Stack elements:");
        stack.display();

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop:");
        stack.display();

        System.out.println("Peek element: " + stack.peek());
    }
}