public class BalanceBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BalanceBT solution = new BalanceBT();
        System.out.println(solution.isBalanced(root)); // Output: true or false based on the tree structure
    }

    public int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        if (root.left != null) lh++;
        int rh = height(root.right);
        if (root.right != null) rh++;

        int diff = Math.abs(lh - rh);
        if (diff > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
