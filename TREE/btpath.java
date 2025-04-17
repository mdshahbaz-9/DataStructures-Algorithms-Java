import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
public class btpath {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Helper function to calculate the height of the tree
    public static int height(TreeNode root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // Helper function to calculate the diameter of the tree
    public static int diameter(TreeNode root) {
        if (root == null) return 0;

        int ld = diameter(root.left);
        int leftH = height(root.left);

        int rd = diameter(root.right);
        int rightH = height(root.right);

        // The diameter of the current node is the maximum of:
        // 1. Diameter of the left subtree
        // 2. Diameter of the right subtree
        // 3. Height of the left subtree + height of the right subtree
        return Math.max(leftH + rightH, Math.max(ld, rd));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    // Method to find all root-to-leaf paths in the binary tree
    public void helper(TreeNode root, List<String> ans, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }

        helper(root.left, ans, s + root.val + "->");
        helper(root.right, ans, s + root.val + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        helper(root, arr, "");
        return arr;
    }

    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Calculate the diameter of the tree
        System.out.println("Diameter of the tree: " + diameterOfBinaryTree(root));

        // Find all root-to-leaf paths  in the binary tree
        btpath btpath = new btpath();
        List<String> paths = btpath.binaryTreePaths(root);
        System.out.println("Root-to-leaf paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
