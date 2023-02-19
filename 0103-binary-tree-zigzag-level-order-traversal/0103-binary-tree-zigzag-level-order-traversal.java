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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        travel(resultList, 0, root);
        return resultList;
    }

    private void travel(List<List<Integer>> treeList, int treeLevel, TreeNode currentNode) {
        if (currentNode == null)
            return;
        if (treeList.size() <= treeLevel) {
            treeList.add(new ArrayList<Integer>());
        }
        if (treeLevel % 2 == 0) {
            treeList.get(treeLevel).add(currentNode.val);
        } else {
            treeList.get(treeLevel).add(0, currentNode.val);
        }
        travel(treeList, treeLevel + 1, currentNode.left);
        travel(treeList, treeLevel + 1, currentNode.right);
    }
}