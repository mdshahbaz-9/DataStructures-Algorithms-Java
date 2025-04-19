
import java.util.*;
//import java.util.Stack;
public class stackbasic1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("size is: " + st.size());
         System.out.println(st);

        st.push(1);
        System.out.println("size is: " + st.size());
         System.out.println(st);

        st.push(2);
        System.out.println("size is: " + st.size());
         System.out.println(st);

        st.push(3);
        System.out.println("size is: " + st.size());
         System.out.println(st);

        st.push(4);
        System.out.println("size is: " + st.size());
         System.out.println(st);

        st.push(5);
        System.out.println("size is: " + st.size());
         System.out.println(st);

        // peek 
        System.out.println("peek value is:"+st.peek());
        System.out.println(st);
       // System.out.println("size is: " + st.size());
       





    }
    
}
