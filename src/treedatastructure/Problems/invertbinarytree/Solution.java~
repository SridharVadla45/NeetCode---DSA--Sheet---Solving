package src.treedatastructure.Problems.invertbinarytree;

import src.treedatastructure.Problems.levelordertraversal.Solution.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
       if(root == null ) return  root;
       return recursive(root);
    }

    private TreeNode recursive(TreeNode root){
        if(root == null ) return root;
        TreeNode temp = root.right;
        root.right=root.left;
        root.left=temp;
        recursive(root.left);
        recursive(root.right);
       return root;
    }


}
