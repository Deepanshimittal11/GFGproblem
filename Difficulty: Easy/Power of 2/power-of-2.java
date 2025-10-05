class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n<0) return false;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }
}