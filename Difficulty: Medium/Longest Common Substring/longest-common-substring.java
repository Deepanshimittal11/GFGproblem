class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        int[][] dptake = new int[n][m];
        for(int[] rows : dptake){
            Arrays.fill(rows, -1);
        }
        return helper(s1, s2, 0, 0, n, m, dp, dptake);
    }
    public int helper(String s1, String s2, int i, int j, int n, int m, int[][] dp, int[][] dptake){
        if(i==n || j==m) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        
        int take = take(s1, s2, i, j, n, m, dptake);

        int skip1 = helper(s1, s2, i+1, j, n, m, dp, dptake);
        int skip2 = helper(s1, s2, i, j+1, n, m, dp, dptake);
        return dp[i][j] = Math.max(take, Math.max(skip1, skip2));
    }
    public int take(String s1, String s2, int i, int j, int n, int m, int[][] dptake){
        if(i==n || j==m) return 0;
        if(dptake[i][j] != -1) return dptake[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)){
            return dptake[i][j] = 1 + take(s1, s2, i+1, j+1, n, m, dptake);
        }
        return dptake[i][j] = 0;
    }
}