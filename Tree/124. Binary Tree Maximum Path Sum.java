package Tree;

 class BinaryTreeMaximumPathSum {
    int maxPath;
public int maxPathSum(TreeNode root){
    if(root == null) return 0;
    maxPath = Integer.MIN_VALUE;
    hasPath(root);
    return maxPath;
}
public int hasPath(TreeNode root){
    if(root == null) return 0;
    int left = Math.max(0, hasPath(root.left));
    int right = Math.max(0, hasPath(root.right));
    maxPath = Math.max(maxPath, left + right + root.val);
    return Math.max(left, right) + root.val;

}
}
