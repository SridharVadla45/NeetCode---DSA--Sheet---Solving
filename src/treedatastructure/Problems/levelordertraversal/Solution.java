package src.treedatastructure.Problems.levelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

      public class TreeNode {
          public int val;
          public TreeNode left;
          public TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    public List<List<Integer>> levelOrder(TreeNode root) {
  Queue<TreeNode> queue= new LinkedList<>();
  List<List<Integer>> result = new ArrayList<>();
  if(root ==null ) return result;
  queue.add(root);
  while(!queue.isEmpty())
  {
      int size = queue.size();
      List<Integer> temp = new ArrayList<>();
      for(int i=0;i<size;i++){
          TreeNode treeNode = queue.poll();
          temp.add(treeNode.val);
          if(treeNode.left!=null) queue.add(treeNode.left);
          if(treeNode.right!=null) queue.add(treeNode.right);
      }
      result.add(temp);
  }
  return result;

    }
}
