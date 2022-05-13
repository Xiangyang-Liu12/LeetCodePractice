package Top100like.oa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Amazon1 {
    
    public static List<Integer> findDataLocations(List<Integer> locations,List<Integer> movedFrom, List<Integer> movedTo){
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : locations){
            set.add(i);
        }

        int n = movedFrom.size();

        for(int j = 0; j < n; j++){
            int f = movedFrom.get(j);
            int t = movedTo.get(j);
            set.remove(f);
            set.add(t);
        }

        for(int nums : set){
           result.add(nums);
        }
        return result;
    }

}
