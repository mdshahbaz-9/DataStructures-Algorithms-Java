public class InvertTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

        public static void invertTree(Node root) {
            if (root == null) {
                return;
            }

            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }
        public static void printInOrder(Node root) {
            if (root == null) {
                return;
            }

            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
        

    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Inorder traversal of the original tree:");
        Node.printInOrder(root);
        System.out.println();

        Node.invertTree(root);

        System.out.println("Inorder traversal of the inverted tree:");
        root.printInOrder(root);
    }

}
