public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        
        if (leftDepth <= rightDepth) {
            return leftDepth + 1;
        }
        
        return rightDepth + 1;
    }
}
