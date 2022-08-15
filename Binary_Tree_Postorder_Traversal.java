import java.util.*;
public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            List<Integer> a = new ArrayList<Integer>();
            a.addAll(postorderTraversal(root.left));
            a.addAll(postorderTraversal(root.right));
            a.add(root.val);
            return a;
        }
        return new ArrayList<Integer>();
    }
}
