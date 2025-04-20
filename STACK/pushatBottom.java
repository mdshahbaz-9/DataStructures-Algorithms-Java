// pushatBottom
// This program demonstrates how to push an element at the bottom of a stack
// using recursion. It uses a helper function to pop all elements from the stack,
// push the new element, and then push back all the popped elements.
// The main function tests the pushAtBottom function with a sample stack.
// The output shows the stack before and after pushing the new element at the bottom.
//
import java.util.Stack;                      

public class pushatBottom {  
    public static void pushAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, x);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack before pushing at bottom: " + stack);
        pushAtBottom(stack, 10);
        System.out.println("Stack after pushing at bottom: " + stack);
    }
}

