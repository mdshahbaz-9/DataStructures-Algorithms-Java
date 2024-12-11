import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDifference(int[] packets, int students) {
        int n = packets.length;
        
        // If there are fewer packets than students, it's not possible to distribute
        if (students > n) {
            return -1;
        }
        
        // Sort the packets
        Arrays.sort(packets);
        
        // Initialize the minimum difference to a large value
        int minDifference = Integer.MAX_VALUE;
        
        // Find the minimum difference in a sliding window of size 'students'
        for (int i = 0; i + students - 1 < n; i++) {
            int currentDifference = packets[i + students - 1] - packets[i];
            minDifference = Math.min(minDifference, currentDifference);
        }
        
        return minDifference;
    }

    public static void main(String[] args) {
        int[] packets = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int students = 7;
        
        int minDifference = findMinDifference(packets, students);
        System.out.println("Minimum difference is: " + minDifference);
    }
}
