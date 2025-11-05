class Solution {
    public int minSquares(int n) {
        // Code here
        //this is a greedy approch which can not be solved for multiple testcases.
        //n=13
        // int sqrt = 0;
        // int cnt = 0;
        // int sqrtsum = 0;
        // while(n>0){
        //     //sqrt = 13 ka sqrt = 3.61
        //     sqrt = (int)Math.sqrt(n); //3
        //     sqrtsum = sqrt*sqrt; //9
        //     int diff = n-sqrtsum; //4
        //     n = diff;
        //     cnt++; 
        //     if(diff==0) break;
        // }
        // return cnt;
        
        //using dp for this 
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = i;
            for(int j=1;j*j<=i;j++){
                dp[i] = Math.min(dp[i], 1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}