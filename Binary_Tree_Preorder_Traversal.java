import java.util.*;
public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            List<Integer> a = new ArrayList<Integer>();
            a.add(root.val);
            List<Integer> temp = preorderTraversal(root.left);
            a.addAll(temp);
            temp = preorderTraversal(root.right);
            a.addAll(temp);
            return a;
        }
        return new ArrayList<Integer>();
    }
}
