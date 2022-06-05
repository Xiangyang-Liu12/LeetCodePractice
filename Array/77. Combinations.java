package Array;

public class Combinations {
    List<List<Integer>> result =  new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k){
        helper(n,k,1);
        return result;
    } 
    public void helper(int n, int k, int start){
        if(k == 0) result.add(new ArrayList<>(res));
        for(int i = start; i <= n; i++){
             res.add(i);
             helper(n, k-1, i+1);
             res.remove(res.size() -1);
        }
    }   
}
