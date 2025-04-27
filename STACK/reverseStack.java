// This is a Java program to check if the brackets in a string are balanced or not.
import java.util.Stack;
public class reverseStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack:" + st+" ");

        Stack <Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }

         Stack <Integer> gt = new Stack<>();
        while(rt.size() > 0){
            gt.push(rt.pop());
        }

        while (gt.size() > 0 ) {
            st.push(gt.pop());
        }
        System.out.println("Reverse Stack :"+ st +" ");
        

    }
    
}
