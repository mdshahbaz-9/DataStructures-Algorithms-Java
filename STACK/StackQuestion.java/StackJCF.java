import java.util.*;
public class StackJCF {
public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println("peek:"+st.peek());
   // st.push(1);
    System.out.println(st);


    while (!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();

    }
}
    
}
