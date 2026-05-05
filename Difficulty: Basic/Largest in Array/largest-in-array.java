class Solution {
    public static int largest(int[] arr) {
        // code here
        return helper(arr, 0);
    }
    public static int helper(int[] arr, int ind){
        if(ind == arr.length-1) return arr[ind];
        
        int maxi = Math.max(arr[ind], helper(arr, ind+1));
        return maxi;
    }
}
