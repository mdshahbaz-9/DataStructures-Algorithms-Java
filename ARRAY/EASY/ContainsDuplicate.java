import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums)); // Output: true
    }
}
