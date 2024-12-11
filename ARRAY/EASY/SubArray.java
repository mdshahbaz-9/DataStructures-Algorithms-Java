public class SubArray {
    public static void Array(int number[]) {

        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] +" ");
                }
                System.out.println();

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,4,3,6,8,9};
        Array(number);
    }

}

// public class PrintSubarrays {
// public static void main(String[] args) {
// // Hardcoded array
// int arr[] = {1, 2, 3, 4, 5, 6};
// int n = arr.length;

// // Print all subarrays
// System.out.println("All possible subarrays:");
// for (int start = 0; start < n; start++) {
// for (int end = start; end < n; end++) {
// // Print subarray from arr[start] to arr[end]
// for (int k = start; k <= end; k++) {
// System.out.print(arr[k] + " ");
// }
// System.out.println();
// }
// }
// }
// }
