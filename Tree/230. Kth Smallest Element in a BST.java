package Tree;

import java.util.ArrayList;
class Solution{
    public int KthSmallest(TreeNode root, int k){
        ArrayList<Integer> list = helper(new ArrayList<Integer>(), root);
        return list.get(k-1);
    }
    public ArrayList<Integer> helper(ArrayList<Integer> nums, TreeNode root){
    if(root == null) return nums;
    helper(nums, root.left);
    nums.add(root.val);
    helper(nums, root.right);
    return nums;

    }
}