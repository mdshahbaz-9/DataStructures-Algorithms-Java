
import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int idx = 2;
        int x =10;

        Stack <Integer> gt = new Stack<>();
        while (st.size()>idx) {
            gt.push(st.pop());
        }
        st.push(x);
        System.out.println(gt);

        while (gt.size()>0) {
            st.push(gt.pop());
        }
        System.out.println(st);

    }
    
}
