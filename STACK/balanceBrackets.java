import java.util.*;

public class balanceBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            // rule -> 1
            if (ch == '(' ) {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;
                if (st.peek() == '(') st.pop();
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println("enter brackets:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
