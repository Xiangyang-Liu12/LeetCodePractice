package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        Arrays.sort(nums);
        backtrack(nums, 0);
        return result;
    }
    public void backtrack(int[] nums, int start){
        result.add(new ArrayList<>(res));
        for(int i = start; i < nums.length; i++){
            res.add(nums[i]);
            backtrack(nums, i+1);
            res.remove(res.size() - 1);

        }
    }
    }
    

