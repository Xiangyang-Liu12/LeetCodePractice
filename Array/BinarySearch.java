package Array;

public class BinarySearch {
    public int search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        if(start + 1 < end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(target == nums[end]){
            return end;
        }
        if(target == nums[start]){
            return start;
        }
        return -1;
    }
}
