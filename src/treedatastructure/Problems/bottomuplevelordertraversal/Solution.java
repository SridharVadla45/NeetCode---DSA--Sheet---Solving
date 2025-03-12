package src.treedatastructure.Problems.bottomuplevelordertraversal;

import  src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null ) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);
                if(treeNode.left!=null)queue.add(treeNode.left);
                if(treeNode.right!=null)queue.add(treeNode.right);
            }
            result.add(temp);
        }
        return result.reversed();
    }
}
