/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        traverseBSTLeft(root, map, 0);
        traverseBSTRight(root, map, 0);
        return root;
    }

    private void traverseBSTRight(TreeNode node, Map<Integer, Queue<Integer>> map, int lvl) {
        if (node == null) return;

        if (lvl % 2 == 1) {
            Queue<Integer> queue = map.get(lvl);
            node.val = queue.poll();
        }
        lvl++;
        traverseBSTRight(node.right, map, lvl);
        traverseBSTRight(node.left, map, lvl);
    }

    private void traverseBSTLeft(TreeNode node, Map<Integer, Queue<Integer>> map, int lvl) {
        if (node == null) return;

        if (lvl % 2 == 1) {
            Queue<Integer> queue = map.get(lvl);
            if (queue == null) {
                queue = new LinkedList<>();
                queue.add(node.val);
                map.put(lvl, queue);
            } else {
                queue.add(node.val);
            }
        }

        lvl++;
        traverseBSTLeft(node.left, map, lvl);
        traverseBSTLeft(node.right, map, lvl);
    }
}