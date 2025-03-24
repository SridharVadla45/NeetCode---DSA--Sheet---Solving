package src.binarytree.properties.countnoofnodeincompletebt;
import src.binarytree.util.TreeNode;

public class Solution {


    public int countNodes(TreeNode root) {
      int [] count ={0};
      countNodeRecursive(count,root);
      return count[0];
    }

    private void countNodeRecursive(int[] count, TreeNode root) {
        if(root == null ) return;
        count[0]+=1;
        countNodeRecursive(count,root.left);
        countNodeRecursive(count,root.right);
    }


}
