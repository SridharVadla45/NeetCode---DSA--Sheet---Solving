package src.treedatastructure.Problems.zigzaglevelordertraversal;

import  src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null ) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean order = true;
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>(levelSize);
            for(int i =0;i<levelSize;i++){
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);
                if(treeNode.left!=null) queue.add(treeNode.left);
                if(treeNode.right!=null) queue.add(treeNode.right);
            }
            if(!order){
                int left =0;
                int right =levelSize-1;
                while(left<=right){
                    int val = temp.get(left);
                    temp.set(left,temp.get(right));
                    temp.set(right,val);
                    left++;
                    right--;
                }
            }
            result.add(temp);
            order=!order;
        }
        return result;

    }
}
