public class BinaryTree {

    private TreeNode root;

    private static class TreeNode{
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);


        //connect

        root = first;

        first.left=second;
        first.right=third; //second <----first----> third

        second.left=fourth;
    }
    public void PreOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.data+ " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.CreateBinaryTree();
        bt.PreOrder(bt.root);
    }
}
