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
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
    }
}
