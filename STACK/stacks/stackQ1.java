import java.util.*;
import java.util.Stack;
public class stackQ1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());

        }
        System.out.println(gt);
        // Stack<Integer> rt = new Stack<>();
        // while(gt.size()>0){
        //     rt.push(gt.pop());
        // }
        // System.out.println(rt);
        
        
    }
    
}
