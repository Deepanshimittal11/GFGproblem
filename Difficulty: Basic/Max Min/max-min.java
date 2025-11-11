// User function Template for Java

class Solution {
    public static int findSum(int A[], int N) {
        // code here
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int num : A){
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }
        
        return maxi+mini;
    }
}
