package Dp;

import java.util.Arrays;

public class CoinChange {
   
    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for(int i = 0; i <= amount; i++){
            for(int coin : coins){
              if(i < coin) continue;
              dp[i] = Math.min(dp[i], dp[i-coin] + 1);
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }

}
