class SameTree {

    // TreeNode class is defined here  //
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // isSameTree method to compare two trjees
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;  // Both trees are null
        if (p == null || q == null) return false; // One tree is null and the other is not
        if (p.val != q.val) return false; // Values differ
        
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // main method to test the isSameTree function
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(tree1, tree2);
        System.out.println("The trees are the same: " + result);
    }
}
