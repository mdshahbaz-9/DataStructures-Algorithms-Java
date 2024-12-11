class Heightoftree{
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh , rh) + 1;
    }
    public static void main(String[] args) {
/* 
                    1
                   / \
                   2  3
                  / \ / \
                  4 5 6  7
        */
        
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right.left = new TreeNode(6);
       root.right.right = new TreeNode(7);
       System.out.println("Hight of tree:"+height(root));
    }
}

