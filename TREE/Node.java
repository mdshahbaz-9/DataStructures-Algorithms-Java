class Node {
    int data;
    Node left, right;
  
    Node(int item) {
      data = item;
      left = right = null;
    }
  }
  
  class Tree {
    Node root;
  
    Tree(int[] inorder, int[] postorder) {
      root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
  
    int search(int item) {
      return search(root, item);
    }
  
    int search(Node root, int item) {
      if (root == null)
        return -1;
      if (root.data == item)
        return 1;
      if (item < root.data)
        return search(root.left, item);
      else
        return search(root.right, item);
    }
  
    void preOrder(Node root) {
      if (root != null) {
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
      }
    }
  
    Node buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
      if (inStart > inEnd)
        return null;
  
      int value = postorder[postEnd];
      Node node = new Node(value);
  
      int index = inStart;
      for (int i = inStart; i <= inEnd; i++) {
        if (inorder[i] == value) {
          index = i;
          break;
        }
      }
  
      int leftSubtreeSize = index - inStart;
      node.left = buildTree(inorder, inStart, index - 1, postorder, postStart, postStart + leftSubtreeSize - 1);
      node.right = buildTree(inorder, index + 1, inEnd, postorder, postStart + leftSubtreeSize, postEnd - 1);
  
      return node;
    }
  }
  
   class Main {
    public static void main(String[] args) {
      int[] inorder = {20, 19, 24, 11, 6, 13, 8};
      int[] postorder = {20, 24, 19, 11, 6, 13, 8};
      Tree tree = new Tree(inorder, postorder);
      System.out.println("Preorder traversal of the constructed tree:");
      tree.preOrder(tree.root);
    }
  }
  