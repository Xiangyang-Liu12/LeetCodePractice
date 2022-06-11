public class solution{
    public int majorityElement(int[] nums){
    if(nums.length ==  1) return nums[0];
      Map<Integer, Integer> map = new HashMap<>();
      for(int i : nums){
          if(map.containsKey(i) && map.get(i) > nums.length/2){
                return i;
          }else{
              map.put(i, map.getOrDefault(0, i)+1);
          }
      }
      return -1;
    }
}