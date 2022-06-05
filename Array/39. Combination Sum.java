package Array;

public class Combination Sum {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target){
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return result;
        helper(nums, target,0);
        return  result;
    }

    public void helper(int[] nums, int target, int start){
        if(target < 0) return;
        if(target == 0) result.add(new ArrayList<>(res));

        for(int i = start; i< nums.length; i++){
            res.add(nums[i]);
            helper(nums, target - nums[i]; i+1);
            res.remove(res.size() - 1);
        }
    }
}
