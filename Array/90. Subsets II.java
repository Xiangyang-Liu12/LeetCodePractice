package Array;

import java.util.Arrays;

public class SubsetsII {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        helper(nums, 0);
        return result;
    }
    public void helper(int[] nums, int start){
        result.add(new ArrayList<>(res));

        for(int i = start; i < nums.length; i++){
            if(i!=start && nums[i-1] != nums[i]) continue;
            res.add(nums[i]);
            helper(nums, i+1);
            res.remove(res.size() - 1);
        }
    }
}
