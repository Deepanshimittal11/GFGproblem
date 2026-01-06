class Solution {
    int[] dp;
    public int minCoins(int coins[], int sum) {
        // code here
        dp = new int[sum+1];
        Arrays.fill(dp, -1);
        
        int res = helper(coins, sum);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int helper(int[] coins, int sum){
        if(sum==0) return 0;
        if(sum < 0) return Integer.MAX_VALUE;
        if(dp[sum] != -1) return dp[sum];
        
        int mini = Integer.MAX_VALUE;
        for(int coin : coins){
            int sub = helper(coins, sum-coin);
            if(sub != Integer.MAX_VALUE){
                mini = Math.min(mini, 1+sub);
            }
        }
        return dp[sum] = mini;
    }
}