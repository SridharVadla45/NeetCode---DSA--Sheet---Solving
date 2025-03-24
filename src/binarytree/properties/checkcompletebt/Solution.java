package src.binarytree.properties.checkcompletebt;

import src.binarytree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isCompleteTree(TreeNode root) {
        if(root == null ) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isNullExists=false;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr!=null){
                    if(isNullExists) return false;
                    queue.add(curr.left);
                    queue.add(curr.right);
                }else {
                    isNullExists=true;
                }
            }

        }

        return true;
    }
}
