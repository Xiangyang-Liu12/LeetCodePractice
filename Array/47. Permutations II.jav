public class solutin{
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> permute(int nums){
        if(nums.length == 0|| nums == null) return list;
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums, used);
        return result;
    }
    
    public void helper(int[] nums, boolean[] used){
        if(res.size() == nums.length){
            res.add(new ArrayList<>(res));
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            if(i > 0 && nums[i-1] != nums[i] && !used[i-1]) continue;
            used[i] = true;
            res.add(nums[i]);
            helper(nums, used);
            used[i] = false;
            res.remove(res.size() - 1);
        }
    }
}