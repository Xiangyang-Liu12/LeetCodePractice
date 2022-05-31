import java.util.Arrays;

class solution{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        Arrays.sort(nums);
        helper(nums, 0);
        return result;
    }
    public void helper(int[] nums, int start){
        result.add(new ArrayList<>(res));
        for(int i = start; i < nums.length; i++){
            res.add(nums[i]);
            helper(nums, i+1);
            res.remove(res.size() - 1);
        }
    }
}