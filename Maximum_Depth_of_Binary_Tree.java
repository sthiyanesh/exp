public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root!=null){
            int a=maxDepth(root.left);
            int b=maxDepth(root.right);
            return ((a>b)?a:b)+1;
        }
        return 0;
    }
}
