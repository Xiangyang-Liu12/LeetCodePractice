class permutations{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums){
        helper(nums);
        return result;
    }

    public void helper(int[] nums){
        if(nums.length == res.size()){
          result.add(new ArrayList<>(res));
        }

        for(int i = 0; i < nums.length; i++){
            if(res.contains(nums[i])) continue;

            res.add(nums[i]);
            helper(nums);
            res.remove(res.size() -1);
        }
    }
}   