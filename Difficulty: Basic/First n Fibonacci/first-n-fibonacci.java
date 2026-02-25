// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] ans = new int[n];
        
        if(n==0) return new int[0];

        ans[0] = 0;
        if(n>=2) ans[1] = 1;
        for(int i=2;i<n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans;
    }
}