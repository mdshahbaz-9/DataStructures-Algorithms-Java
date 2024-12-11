class Diameter1 {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Function to calculate diameter and height in a single traversal
    public static TreeInfo diameterOptimized(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0); // Height and diameter are 0
        }

        // Recursive calls for left and right subtrees
        TreeInfo left = diameterOptimized(root.left);
        TreeInfo right = diameterOptimized(root.right);

        // Height of the current node
        int height = Math.max(left.height, right.height) + 1;

        // Diameter through the current node
        int diameterThroughNode = left.height + right.height + 1;

        // Maximum diameter so far
        int diameter = Math.max(diameterThroughNode, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }

    public static void main(String[] args) {
        /*
                        1
                       / \
                      2   3
                     / \ / \
                    4  5 6  7
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeInfo info = diameterOptimized(root);
        System.out.println("Height of tree: " + info.height);
        System.out.println("Diameter of tree: " + info.diameter);
    }
}
