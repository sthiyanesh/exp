import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = inorder(root);
        if(a==null)
            return new ArrayList<Integer>();
        return a;
    }
    public static List<Integer> inorder(TreeNode root) {
        if(root!=null){
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> temp = inorder(root.left);
            if(temp!=null)
                a.addAll(temp);
            a.add(root.val);
            temp = inorder(root.right);
            if(temp!=null)
                a.addAll(temp);
            return a;
        }
        return null;
    }
}
