
import java.util.*;
public class ac {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head =null;
    public static boolean isEmpty(){
        return head == null;
    }
    //push
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head  = newNode;
    }

    // Pop
    public static int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int popped = head.data;
        head = head.next;
        return popped;
    }
    // print function...
    public static void print(){
        if(head == null){
            System.out.println("Stack is empty..Fill the data");
            return;
        }
        Node temp= head;
        while ((temp!=null)) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        print(); 
       
    }
}
