// User function Template for Java
import java.util.*;

class Solution {
    static int findTargetSumWays(int N, int[] nums, int target) {
        // code here
        //p=positive selected number
        //n = negative selected number
        // p-n = target, p+n = sum
        int sum = 0;
        for(int num : nums) sum += num;
        
        if(Math.abs(target) > sum || (target + sum)%2!=0) return 0;
        
        int p = (target + sum)/2;
        int[] dp = new int[p+1];
        dp[0] = 1;
        
        
        for(int num : nums){
            for(int i=p;i>=num;i--){
                dp[i] += dp[i-num];
            }
        }
        return dp[p];
    }
};