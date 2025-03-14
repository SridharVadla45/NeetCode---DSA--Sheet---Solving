package src.treedatastructure.Problems.sumofroottoleafbinarynumbers;

import  src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;
public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,"");
      return 0;
    }

    private void dfs(TreeNode node,String temp){
        if(node == null || (node.left==null && node.right==null)) System.out.println(temp);
        temp+=node.val;
        dfs(node.left,temp);
        dfs(node.right,temp);
    }
}
