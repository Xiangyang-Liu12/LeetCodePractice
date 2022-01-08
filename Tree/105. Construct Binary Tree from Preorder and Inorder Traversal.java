package Tree;

import java.util.HashMap;
import java.util.Map;

class ConstructBinaryTreefromPreorderandInorderTraversal{
public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < inorder.length; i++){
        map.put(inorder[i], i);
    }
    return helper(preorder, inorder, 0,0, inorder.length - 1, map);
}
public static TreeNode helper(int[] preorder, int[] inorder, int preStart, int  inStart,int inEnd, Map<Integer, Integer> map){
   if(preStart > preorder.length || inStart > inEnd){
       return null;
   }

   TreeNode root = new TreeNode(preorder[preStart]);
   int rootIndex = map.get(preorder[preStart]);
  
   root.left = helper(preorder, inorder, preStart + 1, inStart, rootIndex - 1, map);
   root.right = helper(preorder, inorder, preStart + 1 + rootIndex - inStart, rootIndex + 1, inEnd, map);

   return root;

}
    
}
