//package DSAWithJava;

import java.util.*;

public class LinkedList {
    // creat node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) { // o(n)
        // step 1 creat new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2-> newnode next = head
        newNode.next = head; // link

        // step 3-> head = newnode
        head = newNode;
    }

    // add last
    public void addlast(int data) { // o(n)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    } 

    // ptint a linked list
    public void print() {
        if (head == null) {
            System.out.println("link list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp=>prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // remove in linklist

    //public int removefirst() {
        // if (size == 0) {
        //     System.out.println("linklist is empty");
        //     return Integer.MIN_VALUE;
        // } else if (size == 1) {
        //     int val = head.data; // step ->1
        //     head = tail = null; // step ->2
        //     return val; // step ->3

        // }
        // int val = head.data;
        // head = head.next;
        // size--;
        // return val;
        public Node removeFirst(){

        
        if(head == null){
        return null;

        }
        if(head.next == null){
            head = null;

        }
        Node temp= head;
        head = head.next;
        temp= null;
        return head;
    }



    

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { 
            int val = head.data;
            head = tail = null;
            size = 0;
        }
        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found case
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found case
        return -1;
    }

    // search (recursive) search for key in a linkedlist . return the posation where
    // it is found , return -1 . use recursion

    public int helper(Node head, int key) { // 0(n)
        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse linked list ....*important*....
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    // find and remove nth node frome end

    public void deleteNthfromeEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

        }
        if (n == sz) {
            head = head.next; // removefirst
            return;
        }
        // size -n;
        int i = 1;
        int itofind = sz - n; // inde to find
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }

    // find mid for palindrome
    // slow fast approach
    public Node findmid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my mid node

    }
    // check if linklist is palindrome

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 -> find mid
        Node midNode = findmid(head);

        // step 2-> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = next;
            curr = next;

        }
        Node right = prev; // right half head
        Node left = head;

        // step 3 -> check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;

        }

        return true;
    }

    // Detect a loop/ cycle in a linkesd list
    public static boolean isCycle() { // floyd's CFA
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // cycle exist

            }
        }
        return false; // cycle dose't exist
    }

    // .....Remove a loop /cycle in a linklist
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = fast.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }

        }
        if (cycle == false){
            return;
        }

        // step 1
        // find meeting point 
        slow = head;
        Node prev = null;  //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
          // remove cycle -> last.next = null
          prev.next = null;
    }

    //......Zig_Zag Linked list..........
    public void zigZag(){
        // find mid 
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // step 2
        // reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;
     // step 3
        // alt merge -zig-zag merge
        
        while(left != null && right !=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
    }
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addfirst(2);
        // // ll.print();
        // ll.addfirst(1);
        // // ll.print();
        // ll.addlast(3);
        // // ll.print();
        // ll.addlast(4);
        // ll.addlast(5);
        // // ll.add(2, 9);
        // ll.print();

        // ll.removefirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println("size of linklist : " + ll.size);
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromeEnd(3);
        // ll.print();
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // deteact a loop / cycle in a linked list
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // System.out.println(isCycle());

        // ll.addlast(1);
        // ll.addlast(2);
        // ll.addlast(2);
        // ll.addlast(10);
        // ll.print();
       // System.out.println(ll.checkPalindrome());
       //removeCycle();
       //System.out.println(removeCycle());
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(3);
       ll.addlast(4);
       ll.addlast(5);
       ll.print();
       ll.removeFirst();
       ll.print();;

        //  ll.zigZag();
        //  ll.print();

       

    }

}
