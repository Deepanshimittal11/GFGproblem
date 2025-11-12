class Solution {
    static int[][] dp;
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        //pick and no pick case.
        int n = val.length;
        dp = new int[n+1][W+1];
        for(int[] rows : dp) Arrays.fill(rows, -1);
        return helper(W, 0, val, wt, dp);
    }
    public int helper(int W,int i, int[] val , int[] wt, int[][] dp){
        int n = val.length;
        int pick = 0;
        
        if(i>=n || W<0) return 0;
        if(dp[i][W] != -1) return dp[i][W];
        
        if(wt[i]<=W){
            pick = val[i] + helper(W-wt[i], i+1, val, wt, dp);
        }
        int notPick = helper(W, i+1, val, wt, dp);
        dp[i][W] = Math.max(pick, notPick);
        return dp[i][W];
    }
}
