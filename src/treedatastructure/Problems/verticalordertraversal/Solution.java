package src.treedatastructure.Problems.verticalordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import  src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

public class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
      if(root == null ) return  ans ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){


        }
        return null;
    }
}
