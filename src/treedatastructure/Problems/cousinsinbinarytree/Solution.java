package src.treedatastructure.Problems.cousinsinbinarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public boolean isCousins(TreeNode root, int x, int y) {

        int[] tempx={0,0};
        int[] tempy={0,0};
        Queue<TreeNode> queue = new LinkedList<>();
        int level =0;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                if(current.left!=null){
                    if(current.left.val==x){
                        tempx[0]=current.val;
                        tempx[1]=level+1;
                    }
                    if(current.left.val==y){
                        tempy[0]=current.val;
                        tempy[1]=level+1;
                    }

                    queue.add(current.left);
                }
                if(current.right!=null){
                    if(current.right.val==x){
                        tempx[0]=current.val;
                        tempx[1]=level+1;
                    }

                    if(current.right.val==y){
                        tempy[0]=current.val;
                        tempy[1]=level;
                    }
                    queue.add(current.right);
                }
            }
            level++;
        }

        if(tempx[1]==tempy[1] &&  tempx[0]!=tempy[0]  && x!=tempx[0] && y!=tempy[0]) return true;
        return false;
    }
}
