package BST;

public class Searchbst {

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

    public static boolean Search (Node root, int key){
        if(root == null){
            return false;
        }
         if(root.data == key){
            return true;
         }

         if(root.data < key){
            return Search(root.left, key);

         } else{
            return Search(root.right, key);
         }

    }
    public static void main(String[] args) {
        int values[] = {5, 2, 3, 4, 2, 7};
        Node root = null;

        if(Search(root, 7)){
            System.out.println("found");

        } else{
            System.out.println("Not found");
        }

        
    }
    
    
}
