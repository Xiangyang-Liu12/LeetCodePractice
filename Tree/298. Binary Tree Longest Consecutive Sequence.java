package Tree;

class Solution {
    int max = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        helper(root, 0, root.val);
        return max;
    }
    public void helper(TreeNode root, int current, int target){
        if(root == null) return;
        if(root.val == target){
            current++;
        }else{
            current = 1;
        }
        max = Math.max(max, current);
        helper(root.left, current, root.val + 1);
        helper(root.right, current, root.val + 1);
    }
}