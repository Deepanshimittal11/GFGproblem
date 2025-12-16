// User function Template for Java

class Solution {

    public int minDifference(int nums[]) {
        // Your code goes here
        int sum = 0;
        for(int num : nums) sum += num;
        List<Integer> ans = subset(nums, sum/2);
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            mn = Math.min(mn, sum - 2*ans.get(i));
        }
        return mn;
    }
    public List<Integer> subset(int[] nums, int sum){
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++) dp[i][0] = true;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=sum;i++){
            if(dp[n][i]) ans.add(i);
        }
        return ans;
    }
}
