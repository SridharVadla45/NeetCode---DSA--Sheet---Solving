package src.treedatastructure.Problems.issymetric;

import src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        // direction  0 -left 1- rigth
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode= queue.poll();
                if(treeNode!=null) temp.add(treeNode.val);
                else temp.add(null);
                if(treeNode!=null){
                    if(treeNode.left!=null){
                        queue.add(treeNode.left);
                    }else{
                        queue.add(null);
                    }
                    if(treeNode.right!=null){
                        queue.add(treeNode.right);
                    }else{
                        queue.add(null);
                    }
                }


            }

            if(!ishelper(temp)) return false;
        }
       return true;
    }

    private boolean ishelper(ArrayList<Integer> temp) {
        int left = 0;
        int right =temp.size()-1;
        while(left<right){
            if(temp.get(left)!=temp.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
