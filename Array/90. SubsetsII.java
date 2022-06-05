package Array;

import java.util.Arrays;

public class SubsetsII {
    
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> solution(int[] nums, int start){
        if(nums.length == 0 || nums == null) return result;
        Arrays.sort(nums);
        helper(nums, 0);
        return result;
    }

    public void helper(int[] nums, int start){
        res.add(new ArrayList<>(res));

        for(int i = start; i < nums.length; i++){
            if(i!= start && nums[i] == nums[i-1]) continue;
            res.add(nums[i]);
            helper(nums, i+1);
            res.remove(res.size() - 1);
        }
    }
    
}
