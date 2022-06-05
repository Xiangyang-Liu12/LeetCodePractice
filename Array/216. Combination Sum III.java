package Array;

public class CombinationSumIII {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> conbin(int k, int n){
        helper(k, n, 1);
        return list;
    }

    public void helper(int k , int n, int start){
        if(k == res.size() && n == 0) res.add(new ArrayList<>(res);

        for(int i = start; i <= 9; i++){
              res.add(i);
              helper(k, n-i, i+1);
              res.remove(res.size() -1);
        }
    
    }
}
