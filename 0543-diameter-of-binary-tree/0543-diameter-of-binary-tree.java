/**
 * Definition for a binary tree node.
 * This class represents a node in a binary tree, with a value and pointers to its left and right child nodes.
 */
class TreeNode {
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

/**
 * This class contains methods to solve for the diameter of a binary tree.
 */
class Solution {
    private int maxDiameter; // Holds the maximum diameter found

    /**
     * Finds the diameter of a binary tree, which is the length of the longest path between any two nodes in a tree.
     * This path may or may not pass through the root.
     * 
     * @param root the root node of the binary tree
     * @return the diameter of the binary tree
     */
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        depthFirstSearch(root);
        return maxDiameter;
    }

    /**
     * A recursive method that calculates the depth of the tree and updates the maximum diameter.
     * The path length between the nodes is calculated as the sum of the heights of left and right subtrees.
     *
     * @param node the current node
     * @return the maximum height from the current node
     */
    private int depthFirstSearch(TreeNode node) {
        if (node == null) {
            // Base case: if the current node is null, return a height of 0
            return 0;
        }
        // Recursively find the height of the left and right subtrees
        int leftHeight = depthFirstSearch(node.left);
        int rightHeight = depthFirstSearch(node.right);
      
        // Update the maximum diameter if the sum of heights of the current node's subtrees is greater
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
      
        // Return the max height seen up to the current node, including the current node's height (which is 1)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}