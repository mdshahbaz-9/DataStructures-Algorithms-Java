// //package Question;
import java.util.*;
// public class ArrayImp {
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
//     static class Queue {
//         private int arr[];
//         private int size;
//         private int rear;

//         Queue(int n) {
//             size = n;
//             arr = new int[size];
//             rear = -1;
//         }

//         public boolean isEmpty() {
//             return rear == -1;  
//         }

//         // add
//         public void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         // remove front
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

    
// }


public class ArrayImp{
  static  class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear ==  -1;

        }

        //add 
        void add(int data){
            if(rear == size-1){
                System.out.println("empty queue");
            }

            rear = rear+1;
            arr[rear] = data;
        }

        //  remove
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i =0; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //peek
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        System.out.println(q.peek());


        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}

