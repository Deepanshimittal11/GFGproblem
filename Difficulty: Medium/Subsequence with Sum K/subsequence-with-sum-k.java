class Solution {
    Boolean[][] dp;
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        dp = new Boolean[arr.length][k];
        return helper(arr, k, 0, 0);
        
    }
    public boolean helper(int[] arr, int k, int target, int ind){
        if(target == k){
            return true;
        }
        if(ind == arr.length || target > k){
            return false;
        }
        if(dp[ind][target] != null){
            return dp[ind][target];
        }
        
        boolean pick = helper(arr, k, target+arr[ind], ind+1);
           
        boolean notpick = helper(arr, k, target, ind+1);
        
        return dp[ind][target] = pick || notpick;
    }
}