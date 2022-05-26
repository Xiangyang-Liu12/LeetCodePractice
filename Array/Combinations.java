package Array;

import java.util.ArrayList;

public class Combinations {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k){
    combination();
    return result;
    }
    public void combination(int n, int k, int start){
        if(k == 0){
            result.add(new ArrayList<>(res));
            return;
        }
        for(int i = start; i <= n; i++){
           res.add(i);
           combination(n, k-1, i+1);
           res.remove(res.size() - 1);
        }
    }

}
