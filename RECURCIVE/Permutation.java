public class Permutation {
    
    public static void findPermutation(String str, String ans) {
        // Base case: If the string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursive case: Iterate through the string and form permutations
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // Current character
            String newStr = str.substring(0, i) + str.substring(i + 1); // Remaining string
            findPermutation(newStr, ans + curr); // Recursive call with updated string and answer
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, ""); // Initial call to findPermutation
    }
}
