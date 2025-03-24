package src.binarytree.properties.balancedbt;
import src.binarytree.util.TreeNode;
public class Solution {

    public boolean isBalanced(TreeNode root) {
     return  height(root)!=-1;
    }

    private int height(TreeNode root) {
        if(root==null) return 0;
        int left = height(root.left);
        int right=height(root.right);
        int temp = left-right;
        if(Math.abs(temp)>1){
            return -1;
        }
        return 1+ Math.max(left,right);
    }
}
