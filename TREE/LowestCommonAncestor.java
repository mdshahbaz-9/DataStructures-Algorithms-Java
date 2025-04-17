public class LowestCommonAncestor {
//     p
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        // Base case: if root is null or matches one of the nodes
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // Recursively find LCA in left and right subtrees
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // If both leftLca and rightLca are non-null, root is the LCA
        if (leftLca != null && rightLca != null) {
            return root;
        }

        // Otherwise, return the non-null value
        return (leftLca != null) ? leftLca : rightLca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("LCA(4, 5) = " + lca(root, 4, 5).data);
        System.out.println("LCA(4, 6) = " + lca(root, 4, 6).data);
        System.out.println("LCA(3, 4) = " + lca(root, 3, 4).data);
        System.out.println("LCA(2, 4) = " + lca(root, 2, 4).data);
    }
}
