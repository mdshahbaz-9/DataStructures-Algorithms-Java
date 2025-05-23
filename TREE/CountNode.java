// question: count the number of nodes in a binary tree and sum of all nodes in a binary tree.
// import java.util.*;
//count node
public class CountNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int leftcount = count(root.left);
            int rightcount = count(root.right);
            int treecount = (leftcount + rightcount) + 1;
            return treecount;

        }
        public static int sum(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            int treeSum = leftSum+rightSum+root.data;
            return treeSum;

        }

        public static void main(String[] args) {
            /*
                           1
                          / \
                          2  3
                         / \ / \
                         4 5 6 7
             */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            System.out.println("Numbers of Node = "+count(root));

            System.out.println(sum(root));
        }

    }

