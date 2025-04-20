import java.util.*;

public class b {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Enter brackets:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));  
            
        // Test cases
        System.out.println(isBalanced("()")); // true
        System.out.println(isBalanced("()[]{}")); // true
        System.out.println(isBalanced("(]")); // false
        System.out.println(isBalanced("([)]")); // false
        System.out.println(isBalanced("{[]}")); // true
        System.out.println(isBalanced("((()))")); // true
        System.out.println(isBalanced("((())")); // false
        System.out.println(isBalanced("((()))}")); // false

    }
}
