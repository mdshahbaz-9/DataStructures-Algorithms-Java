public class BuildBst {
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

    // Insert method to build the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // Create a new node when the root is null
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) { // Avoid duplicate entries
            root.right = insert(root.right, val);
        }
        // Return the root (unchanged)
        return root;
    }

    // Inorder traversal to display the BST
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " "); // Use print instead of println for cleaner output
        inorder(root.right);
    }

    // Search method
    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        // Correct logic for traversing the tree
        if (root.data > key) {
            return Search(root.left, key); // Search in the left subtree
        } else {
            return Search(root.right, key); // Search in the right subtree
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 2, 3, 4, 2, 7}; // Array of values to insert
        Node root = null;

        // Insert values into the BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Display the BST using inorder traversal
        inorder(root);
        System.out.println();

        // Search for a key and display the result
        int searchKey = 3;
        if (Search(root, searchKey)) {
            System.out.println(searchKey + " found");
        } else {
            System.out.println(searchKey + " not found");
        }
    }
}
