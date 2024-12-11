
//package StackImplLinkedList.java;
import java.util.*;

public class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop

        public static int pop() {

            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void print() {

            if (head == null) {
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.print();
System.out.println("peek value:"+s.peek());
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();

        // }

    }

}
