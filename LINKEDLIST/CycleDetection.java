class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CycleDetection {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                // Find the entry point of the cycle
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // Start of the cycle
            }
        }

        return null; // No cycle
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle

        CycleDetection solution = new CycleDetection();
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
