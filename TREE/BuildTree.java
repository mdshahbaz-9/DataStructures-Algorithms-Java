import java.util.*;

public class BuildTree {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
             idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // traversals
        // 1:- Preorder NLR (Node , Left , Right)             -------->    {data , left , right }
        public static void Preorder(Node root) {
            // base case 
            if(root == null){
                return;
            }
            // if(root == null){
            //     System.out.println("-1");
            // }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }

        // 2:- Inorder Traversals   LRR(left , root , right)
        public static void Inorder(Node root){
            // base case
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);


        }

        // post order Traversal  LRR(left subtree, right , root)
        public static void Postorder(Node root){
            if(root == null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }

        //Level order traversal
        public static void Levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    } 
                    }else{
                        System.out.print(currNode.data+" ");
                        if(currNode.left != null){
                            q.add(currNode.left);
                        }
                        if(currNode.right != null){
                            q.add(currNode.right);
                        }
                    }
                }
            }
        }

    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };  // {1,3,7,-1,-1,11,-1,-1,5,17,-1,-1,-1};
        //int nodes[] = {12,31,10,45,66};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("tree root:"+root.data);

        System.out.println("preorder traversals:");
        tree.Preorder(root);
        System.out.println();

        System.out.println("Inorder traversals:");
        tree.Inorder(root);

        System.out.println();
        System.out.println("postorder traversals:");
        tree.Postorder(root);


        System.out.println();
        System.out.println("Levelorder traversal");
        tree.Levelorder(root);
    }
}

