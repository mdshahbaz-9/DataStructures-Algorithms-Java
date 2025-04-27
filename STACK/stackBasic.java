
// This code demonstrates the basic operations of a stack in Java using the Stack
import java.util.Stack;

class stackBasic {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();

    // Pushing integers onto the Stack
    st.push(10);
    st.push(20);

    // Popping and printing the elements
    System.out.println(st.pop()); // Outputs 20
    System.out.println(st.pop()); // Outputs 10
    System.out.println(st);

    // Checking if the stack is empty
    if (st.isEmpty()) {
      System.out.println("Stack is empty.");
    } else {
      System.out.println("Stack is not empty.");
    }
  }
}
