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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightview(root, 0);
        return ans;
    }

    public void rightview(TreeNode root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == ans.size())
        {
            ans.add(root.val);
        }

        rightview(root.right, level + 1);
        rightview(root.left, level + 1);
    }
}