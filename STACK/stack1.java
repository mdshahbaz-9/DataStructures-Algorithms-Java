//
import java.util.*;
//import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println();
        //pop 
         st.pop ();
         System.out.println(st);
        // // peek 
          System.out.println("peek value is:"+st.peek());
         System.out.println("size is: " + st.size());

    }
    
}


