class Solution {
    static Integer[][] dp; //by default value sari null hongi.
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        dp = new Integer[n][n];
        return mcm(arr, 1, n-1);
    }
    static int mcm(int[] arr, int i, int j){
        if(i == j) return 0;
        
        int cost = Integer.MAX_VALUE;
        if(dp[i][j] != null) return dp[i][j];
        
        for(int k=i;k<j;k++){
            int c1 = mcm(arr, i, k);
            int c2 = mcm(arr, k+1, j);
            int c3 = arr[i-1]*arr[k]*arr[j];
            
            int temp = c1+c2+c3;
            
            cost = Math.min(cost, temp);
        }
        
        return dp[i][j] = cost;
    }
}