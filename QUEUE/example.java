import java.util.LinkedList;
import java.util.Queue;

public class example {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// add elements to the queue
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");

		// print the queue                                          [apple, banana, cherry]
		System.out.println("Queue: " + queue); 

		// remove the element at the front of the queue              apple
		String front = queue.remove();
		System.out.println("Removed element: " + front); 

		// print the updated queue                                   [banana, cherry]
		System.out.println("Queue after removal: " + queue);

		// add another element to the queue
		queue.add("date");

		// peek at the element at the front of the queue              banana
		String peeked = queue.peek();
		System.out.println("Peeked element: " + peeked);

		// print the updated queue                                   [banana, cherry, date]
		System.out.println("Queue after peek: " + queue);
	}
}
