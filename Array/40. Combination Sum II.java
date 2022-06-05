package Array;

public class CombinationSumII {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> combin(int[] nums, int target){
        Arrays.sort(nums);
        helper(nums, target, 0);
        return result;
    }
    public void helper(int[] nums, int target, int start){
        if(target < 0) return;
        if(target == 0) result.add(new ArrayList<>(res));

        for(int i = start; i < nums.length; i++){
            if(i!=start && nums[i] == nums[i-1]) continue;
            res.add(nums[i]);
            helper(nums, target - nums[i], i+1);
            res.remove(res.size() -1);

        }
    }
}
