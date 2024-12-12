public class ll {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    // add first
    void addfirst(int data){
        Node newNode = new Node(data);
        if(head == tail) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    void addlast(int data){
        if(head==null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node newNode = new Node(data);
        if(head == tail){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode = tail;
    }

    void print(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
     LinkedList list = new LinkedList();

        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addlast(5);

        list.print(); // Output: 30->20->10->null
    }
}
