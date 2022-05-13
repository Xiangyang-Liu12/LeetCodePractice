package Top100like.oa;

import java.util.List;

public class Amazon2 {
    
    public static int getMaximumGreyness(List<String> pixels){
        int n = pixels.size();
        int m = pixels.get(0).length();
        int[] rows = new int[n];
        int[] cols = new int[m];
        for(int i =0; i < n; i++){
            for(int j = 0 ; j< m; j++){
                int add = pixels.get(i).charAt(j) == '1' ? 1 : -1;
                rows[i] += add;
                rows[j] += add;
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
             ans = Math.max(ans, rows[i] + cols[j]);
        }}
         return ans;
    }
}
