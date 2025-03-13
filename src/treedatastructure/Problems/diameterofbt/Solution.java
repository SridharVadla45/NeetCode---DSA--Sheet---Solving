package src.treedatastructure.Problems.diameterofbt;

import src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int  diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        recursiveHeight(root);
        return diameter-1;
    }

    private  int recursiveHeight(TreeNode root){
        if(root == null) return 0;
        int left = recursiveHeight(root.left);
        int right = recursiveHeight(root.right);
        diameter = Math.max(diameter,1+left+right);
        return 1+ Math.max(left,right);
    }

}
