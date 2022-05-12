package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    
    public static List<List<Integer>> levelOrderTraversal(TreeNode root){
     List<List<Integer>> list = new ArrayList<>();
     if(root == null) return list;
     Queue<TreeNode> q = new LinkedList<>();
     q.offer(root);

     while(!q.isEmpty()){
         int size = q.size();
         List<Integer> currentL = new LinkedList<>();
         for(int i = 0; i < size; i++){
             TreeNode current = q.poll();
             currentL.add(current.val);
             if(current.left != null){
                 q.add(current.left);
             }
             if(current.right != null){
                 q.add(current.right);
             }
         }
        list.add(currentL);
     }
    return list;
    }
}
