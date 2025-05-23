// This is a Java program to implement a stack using ArrayList.
import java.util.*;

public class StackArrayList {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;

        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }

}
