class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int a : arr) sum += a;
        
        int[][] dp = new int[n+1][sum+1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        
        return helper(arr, diff, sum, 0, n-1, dp);
    }
    public int helper(int[] arr, int diff, int sum, int s1, int ind, int[][] dp){
        if(ind < 0){
            if(sum - 2 * s1 == diff) return 1;
            return 0;
        }
        if(dp[ind][s1] != -1) return dp[ind][s1];
        
        int take = helper(arr, diff, sum, s1+arr[ind], ind-1, dp);
        int notTake = helper(arr, diff, sum, s1, ind-1, dp);
        
        return dp[ind][s1] = take + notTake;
    }
}
