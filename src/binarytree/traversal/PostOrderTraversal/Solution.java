package src.binarytree.traversal.PostOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import src.binarytree.util.TreeNode;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(result,root);
        return result;
    }

    private void postorderRecursive(List<Integer> result, TreeNode root) {
        if(root == null ) return;
        postorderRecursive(result,root.left);
        postorderRecursive(result,root.right);
        result.add(root.val);
    }
}
