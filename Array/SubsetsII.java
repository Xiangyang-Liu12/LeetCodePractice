package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsII {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> subsetII(int[] nums){
        Arrays.sort(nums);
        if(nums == null || nums.length == 0){
            return result;
        }
        backtrack(nums, 0);
        return result;
    }

public void backtrack(int[] nums, int start){
    result.add(new ArrayList<>(res));

    for(int i = 0; i < nums.length; i++){
        if(i != start && nums[ i-1] == nums[i]) continue;
        res.add(nums[i]);
        backtrack(nums, i+1);
        res.remove(res.size()-1);
    } 
}
}
