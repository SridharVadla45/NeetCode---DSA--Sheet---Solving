package src.treedatastructure.Problems.averageoflevels;

import java.util.*;

public class Solution {
    static class TreeNode{
       int val ;
       TreeNode left;
       TreeNode right;
       TreeNode(int val){this.val=val;}
    }
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<Double> result = new ArrayList<>();
        if(root==null )return result;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            double temp=0;
            for(int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                temp+=treeNode.val;
                if(treeNode.left!=null) queue.offer(treeNode.left);
                if(treeNode.right!=null) queue.offer(treeNode.right);
            }
            result.add(temp/size);
        }
        return result;


    }
}
