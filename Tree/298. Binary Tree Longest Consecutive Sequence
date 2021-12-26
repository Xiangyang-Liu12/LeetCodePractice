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
    private int max = 0;
    public int longestConsecutive(TreeNode root) {
       if(root == null) return 0;
       helper(root, 0, root.val);
       return max;
    }
    pulic void helper(TreeNode root, int current, int target){
        if(root == null) return;
        if(root.val == target){
            current++;
        }else{
            current = 1;
        }
        max = Math.max(current, result);
        helper(root.left, current, root.val+1);
        helper(root.right, current, root.val+1);
    }
}