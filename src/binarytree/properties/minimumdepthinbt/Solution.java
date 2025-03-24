package src.binarytree.properties.minimumdepthinbt;

import  src.binarytree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int level =1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.left== null && curr.right==null) return level;
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            level++;
        }

     return   level ;
    }


    private int minDepthRecursive(int level, TreeNode root){
        if(root.left== null && root.right== null ) return level;
        if(root.left!=null)minDepthRecursive(level+1,root.left);
        if(root.right!=null)minDepthRecursive(level+1,root.right);
        return level;
    }

   }
