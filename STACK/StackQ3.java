//   push At bottom / Reverse a stack
import java.util.*;
public class StackQ3 {
  public static void PusahAtBottom(Stack<Integer> st , int data){
    if(st.isEmpty()){
     st.push(data);
     return;
    }
    int top =st.pop();
    PusahAtBottom(st, data);
    st.push(top);
}

   public static void reverseStack(Stack<Integer> s){
    if(s.isEmpty()){
      return;
    }
      int top = s.pop();
      
      reverseStack(s);
      PusahAtBottom(s,top);
     
   }
    public static void  printStack(Stack<Integer> s){
       while (!s.isEmpty()) {
        System.out.println(s.pop());
        
       }
    }
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println("original stack:" + s);
     // 3,2,1
    reverseStack(s);
    
    System.out.println("Reverse stack:" + s);
    printStack(s);
  // 1,2,3
   }  
}

// 120