
//Insert at bottom /any index
import java.util.*;
public class StackQ2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        System.out.println("peek value:"+st.peek());
        System.out.println("size:"+st.size());

        Stack <Integer> s = new Stack<>();
        if(st.size() >= 0){
            s.pop();
        }
    System.out.println(s);


    }
}
