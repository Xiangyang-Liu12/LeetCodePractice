package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> conbinationSum(int nums, int target){\
    Arrays.sort(nums);
    conbinations(nums, target, 0);
    return result;
    }
    public void conbinations(int[] nums, int target, int start ){
        if(target < 0) return;
        else if(target == 0) result.add(new ArrayList<>(res));
        else{
            for(int i = start; i < nums.length; i++){
                res.add(nums[i]);
                conbinations(nums, target - nums[i], i);
                res.remove(res.size() - 1);
            }
        }
    }
}
