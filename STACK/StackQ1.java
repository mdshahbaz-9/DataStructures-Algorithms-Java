//Question :- Push at the bottom of the Stack (Amazone)
import java.util.*;
public class StackQ1 {
    public static void PusahAtBottom(Stack<Integer> st , int data){
        if(st.isEmpty()){
         st.push(data);
         return;
        }
        int top =st.pop();
        PusahAtBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
        st.push(1);
        st.push(2);
        st.push(3);
        PusahAtBottom(st, 5);
        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
           
 
        }
          
    }
}
