package src.treedatastructure.Problems.rightnodepointer2;

public class Solution {
    public Node connect(Node root) {
        recursive(root);
        return root;
    }


    private static void recursive(Node root){
        if(root == null || (root.left== null && root.right == null )) return;
        if(root.left!=null){
            if(root.right!=null) root.left.next=root.right;
            else {
                if(root.next!=null){
                    if(root.right!=null){
                        if(root.next.left!=null){
                            root.right.next=root.next.left;
                        }else{
                            if(root.next.right!=null){
                                root.right.next=root.next.right;
                            }
                        }

                    }
                }else{

                }
            }
        }
        if(root.left!=null) recursive(root.left);
        if(root.right!=null) recursive(root.right);

    }

































    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

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
