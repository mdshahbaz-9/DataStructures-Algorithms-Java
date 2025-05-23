//  class Diameter {
//     static class TreeNode {
//         int data;
//         TreeNode left;
//         TreeNode right;

//         TreeNode(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Function to calculate the height of the tree
//     public static int height(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh, rh) + 1;
//     }

//     // Function to calculate the diameter of the tree
//     public static int diameter(TreeNode root) {
//         // Base case
//         if (root == null) {
//             return 0;
//         }

//         // Diameter of the left subtree
//         int leftDiam = diameter(root.left);
//         int leftHt = height(root.left);

//         // Diameter of the right subtree
//         int rightDiam = diameter(root.right);
//         int rightHt = height(root.right);

//         // Diameter through the current node
//         int selfDiam = leftHt + rightHt + 1;

//         // Return the maximum diameter
//         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//     }

//     public static void main(String[] args) {
//         /*
//                         1
//                        / \
//                       2   3
//                      / \ / \
//                     4  5 6  7
//         */
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);

//         System.out.println("Height of tree: " + height(root));
//         System.out.println("Diameter of tree: " + diameter(root) );
//     }
// }

public class Diameter {
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

    // Global variable to store diameter
    static int maxDiameter = 0;

    public static int height(Node root) {
        if (root == null) return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        // Update diameter at every node
        int diameterAtNode = leftH + rightH + 1;
        maxDiameter = Math.max(maxDiameter, diameterAtNode);

        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int height = height(root);
        System.out.println("Height of tree: " + height);
        System.out.println("Diameter of tree: " + maxDiameter);
    }
}
