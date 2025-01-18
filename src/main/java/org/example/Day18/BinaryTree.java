package org.example.Day18;

public class BinaryTree {
    public static Node preorder(Node node){
        if(node==null){
            return null;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
        return node;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
    }
}
