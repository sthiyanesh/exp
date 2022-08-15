public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
            root.left=invertTree(root.left);
        if(root.right!=null)
            root.right=invertTree(root.right);
        return root;
    }
}
