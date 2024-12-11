public class LLImplementationQueue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class QueueLL {
        Node head = null; // Front of the queue
        Node tail = null; // Rear of the queue
        int size = 0;     // Size of the queue

        // Add an element to the queue (enqueue)
        public void add(int data) {
            Node temp = new Node(data);
            if (size == 0) {
                head = tail = temp; // First element
            } else {
                tail.next = temp;   // Link the new node
                tail = temp;        // Update the tail
            }
            size++;
        }

        // Remove an element from the queue (dequeue)
        public int remove() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next; // Move the head to the next node
            size--;

            if (size == 0) { // If the queue is now empty
                tail = null; // Ensure the tail is null as well
            }

            return x;
        }

        // Display all elements in the queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node tmp = head;
            System.out.print("Queue: ");
            while (tmp != null) {
                System.out.print(tmp.val + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Get the size of the queue
        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        QueueLL q1 = new QueueLL();

        q1.display(); // Display empty queue
        System.out.println("Is queue empty? " + q1.isEmpty());


        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display(); // Display queue after adding elements

        q1.remove(); // Remove an element
        q1.display(); // Display queue after removal

        System.out.println("Is queue empty? " + q1.isEmpty());
        System.out.println("Queue size: " + q1.getSize());
    }
}
