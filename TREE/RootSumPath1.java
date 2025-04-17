import java.util.*;

public class RootSumPath1 {
    // Static inner class for the Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to check if a root-to-leaf path with the given sum exists
    public boolean hasPathSum(Node root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && sum - root.data == 0)
            return true;
        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
    }

    public static void main(String[] args) {
        // Creating the binary tree
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        // Instantiating the main class
        RootSumPath1 rootSumPath1 = new RootSumPath1();

        // Checking if there's a root-to-leaf path with sum 22
        System.out.println(rootSumPath1.hasPathSum(root, 22)); // Output: true
    }
}

