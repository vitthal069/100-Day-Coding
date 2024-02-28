// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
  
    // Constructor for creating a new node with a given value.
    TreeNode(int val) {
        this.val = val;
    }
  
    // Constructor for creating a new node with a given value and left & right children.
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    /**
     * Finds the value of the bottom-leftmost node in a binary tree using level order traversal.
     * 
     * @param root The root node of the binary tree.
     * @return The value of the bottom-leftmost node.
     */
    public int findBottomLeftValue(TreeNode root) {
        // Initialize a queue to hold tree nodes in level order.
        Queue<TreeNode> queue = new ArrayDeque<>();
      
        // Begin with the root node.
        queue.offer(root);
      
        // This will hold the most recent leftmost value found at each level.
        int bottomLeftValue = 0;
      
        // Traverse the tree level by level.
        while (!queue.isEmpty()) {
            // Update the bottomLeftValue with the value of the first node in this level.
            bottomLeftValue = queue.peek().val;
          
            // Process each node in the current level and enqueue their children.
            for (int i = queue.size(); i > 0; --i) {
                TreeNode node = queue.poll();
              
                // Enqueue the left child if it exists.
                if (node.left != null) {
                    queue.offer(node.left);
                }
              
                // Enqueue the right child if it exists.
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
      
        // Return the bottom-leftmost value found.
        return bottomLeftValue;
    }
}