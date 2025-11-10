class Solution {
    public int maxProfit(int arr[]) {
        // Code here
        int n = arr.length;
        int[][] dp = new int[n][2];
        for(int[] rows : dp) Arrays.fill(rows, -1);
        return helper(arr, 0, 1, dp);
    }
    public int helper(int[] arr, int i, int canbuy, int[][] dp){
        if(i >= arr.length) return 0;
        if(dp[i][canbuy] != -1) return dp[i][canbuy];
        if(canbuy==1){
            int buy = -arr[i] + helper(arr, i+1, 0, dp);
            int skip = helper(arr, i+1, 1, dp);
            dp[i][canbuy] = Math.max(buy, skip);
        }else{
            int sell = arr[i] + helper(arr, i+2, 1, dp);
            int hold = helper(arr, i+1, 0, dp);
            dp[i][canbuy] = Math.max(sell, hold);
        }
        return dp[i][canbuy];
    }
}
