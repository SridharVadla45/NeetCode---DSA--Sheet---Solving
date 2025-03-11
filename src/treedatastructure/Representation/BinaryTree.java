package src.treedatastructure.Representation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    // Traversals
    //Dfs traversals
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        // preorder traversal
        System.out.println("PreOrder Traversal of binary tree ");
        preOrder(root);
        System.out.println();

        System.out.println("Inorder traversal of a binary tree");
        inOrder(root);
        System.out.println();


        System.out.println("Post order traversal of binary tree");
        postOrder(root);
        System.out.println();


        System.out.println("Level order or breadth first search traversal");
        levelOrder(root);


    }



    private static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                System.out.print(current.value+" ");
                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
            }
            System.out.println();

        }
    }

    private static void postOrder(Node root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }

    private static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }

    private static void preOrder(Node node1) {
        if(node1==null) return;
        System.out.print(node1.value+" ");
        preOrder(node1.left);
        preOrder(node1.right);
    }
}
