package org.example.TraingDay;

// Class representing a single node of the binary tree
class TreeNode {
    int val;         // Value of the node
    TreeNode left;   // Left child
    TreeNode right;  // Right child

    // Constructor to initialize the node value
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Class to implement the binary tree and its traversal
public class BinaryTree {

    // Preorder traversal: Root -> Left -> Right
    public void preorder(TreeNode node) {
        if (node == null) {
            return; // Base case: If the node is null, return
        }
        // Process the current node
        System.out.println(node.val + " ");
        // Recur on the left subtree
        preorder(node.left);
        System.out.println("Finished left ");
        // Recur on the right subtree
        preorder(node.right);
        System.out.println("Finished right ");
    }

    // Main method
    public static void main(String[] args) {
        // Construct the binary tree
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Create an instance of BinaryTree and perform preorder traversal
        BinaryTree tree = new BinaryTree();
        System.out.println("Preorder Traversal of the Binary Tree:");
        tree.preorder(root); // Output: 1 2 4 5 3 6
    }
}
