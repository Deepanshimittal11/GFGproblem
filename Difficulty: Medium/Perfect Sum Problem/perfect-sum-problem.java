class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int[][] dp = new int[target+1][n+1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        
        return helper(nums, target, n-1, dp);
    }
    public int helper(int[] nums, int target, int ind, int[][] dp){
        if(ind==0) {
            if(nums[0]==0 && target==0) return 2;
            if(nums[0]==target || target==0) return 1;
            return 0;
        }
        if(ind<0) return 0;
        if(dp[target][ind] != -1) return dp[target][ind];
        
        int take = 0;
        if(nums[ind]<=target) take = helper(nums, target-nums[ind], ind-1, dp);
        int notTake = helper(nums, target, ind-1, dp);
        return dp[target][ind] = take+notTake;
    }
}