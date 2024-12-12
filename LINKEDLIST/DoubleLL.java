public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addfirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
       // newNode.next = null;
        tail.next = newNode;
        tail = newNode;

    }

    // RemoveFirst
    public void removefirst() {
        if (head == null) {
            System.out.println("dll is empty");
            return ;
        }
        if (head == tail) {
            head = tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Remove last in dll
    public void removeLast(){
        if(head == tail){
            System.out.println("DLL is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else {
          tail =   tail.prev ;
            tail.next = null;

        }
        size--;

    }

      // reverse DLL
       public void reverse(){
        Node curr = head;
        Node prev =  null; 
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    
       }


    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.print();
        // dll.removefirst();
        // dll.removeLast();
        // dll.print();

        dll.reverse();
        dll.print();

        System.out.println(dll.size);
    }
}