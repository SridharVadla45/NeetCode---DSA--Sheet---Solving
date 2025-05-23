package src.treedatastructure.Problems.populatingnextrightpointetineachnode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node temp =null;
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                if(temp==null) temp=node;
                else {
                    temp.next=node;
                    temp=node;
                }
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);

            }
            temp.next=null;
        }
        return root;

    }

    private static Node betterSolution(Node root){
        if(root==null) return root;
        recursive(root);
        return root;
    }

    private static void recursive(Node root){
        if(root ==null || (root.left==null && root.right==null)) return;
        root.left.next=root.right;
        if(root.next!=null){
            root.right.next=root.next.left;
        }else{
            root.right.next=null;
        }
        recursive(root.left);
        recursive(root.right);

    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
